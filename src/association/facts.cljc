(ns association.facts
  "Industry rule/history catalog for the Canadian Chamber of Commerce
  -- a 52nd industry-association-level source (see
  cloud-itonami-assoc-9411-sau-fsc, -9411-aut-wko, -9411-irl-ibec,
  -9411-nzl-businessnz, -9411-cze-spcr, -9411-ind-cii, -9411-zaf-busa,
  -9411-bra-cni, -9411-ken-kam for the first nine) per ADR-2607141700
  (cloud-itonami-compliance-fact-federation). The TENTH entry aligned
  to ISIC 9411 (activities of business, employers, and professional
  membership organizations). Fills Canada's previously-open
  association-axis gap (one of the 18-country gap list recorded at
  tick 144) -- Canada now has real, individually verified facts
  across ALL THREE axes (country: cloud-itonami-iso3166-can
  statute.facts; municipality: cloud-itonami-municipality-can-toronto;
  association: this entry).

  Both entries directly WebFetch-verified against chamber.ca's own
  official 'History' page (https://chamber.ca/about/history/), which
  renders successfully and states verbatim: 'At a national
  conference in Winnipeg, business leaders resolved to create a
  unified voice for Canadian commerce' (1925) and 'First Annual
  Meeting held in Saint John, New Brunswick. The organization became
  the Canadian Board of Trade' (1926). The 1925 date is independently
  corroborated by Wikidata Q132656646's own 'inception' statement.
  The first president's name (S.B. Gundy), incidentally encountered
  on the same page, is NOT persisted here per this project's
  no-personal-names rule.

  An association not in `catalog` has NO spec-basis, full stop; never
  fabricate one.")

(def catalog
  "association-slug -> vector of association-rule entries."
  {"canadianchamber"
   [{:association-rule/id "canadianchamber.founding-1925-winnipeg"
     :association-rule/title "At a national conference in Winnipeg, business leaders resolved to create a unified voice for Canadian commerce, founding what became the Canadian Chamber of Commerce (chamber.ca official History page, corroborated by Wikidata Q132656646 inception statement)"
     :association-rule/association "canadianchamber"
     :association-rule/isic "9411"
     :association-rule/country "CAN"
     :association-rule/kind :governance-program
     :association-rule/url "https://chamber.ca/about/history/"
     :association-rule/url-provenance :official-chamber-ca
     :association-rule/established-date "1925"
     :association-rule/retrieved-at "2026-07-17"
     :association-rule/topic #{:governance}}
    {:association-rule/id "canadianchamber.first-agm-1926-board-of-trade"
     :association-rule/title "First Annual Meeting held in Saint John, New Brunswick, where the organization became the Canadian Board of Trade (chamber.ca official History page)"
     :association-rule/association "canadianchamber"
     :association-rule/isic "9411"
     :association-rule/country "CAN"
     :association-rule/kind :governance-program
     :association-rule/url "https://chamber.ca/about/history/"
     :association-rule/url-provenance :official-chamber-ca
     :association-rule/established-date "1926"
     :association-rule/retrieved-at "2026-07-17"
     :association-rule/topic #{:governance}}]})

(defn spec-basis [association] (get catalog association))

(defn coverage
  ([] (coverage (keys catalog)))
  ([associations]
   (let [have (filter catalog associations)
         missing (remove catalog associations)]
     {:requested (count associations)
      :covered (count have)
      :covered-associations (vec (sort have))
      :missing-associations (vec (sort missing))
      :note (str "cloud-itonami-assoc-9411-can-chamber Wave 0 (ADR-2607141700): "
                 (count (get catalog "canadianchamber")) " Canadian Chamber of Commerce entries seeded "
                 "with chamber.ca official History page + Wikidata Q132656646 corroboration. "
                 "Extend `association.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [association topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis association)))
