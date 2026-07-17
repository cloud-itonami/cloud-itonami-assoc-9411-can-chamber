# cloud-itonami-assoc-9411-can-chamber

Industry rule/history catalog for the **Canadian Chamber of Commerce**
— the TENTH entry aligned to **ISIC 9411** (activities of business,
employers, and professional membership organizations), alongside
[`-9411-sau-fsc`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-sau-fsc)
(Saudi Arabia),
[`-9411-aut-wko`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-aut-wko)
(Austria),
[`-9411-irl-ibec`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-irl-ibec)
(Ireland),
[`-9411-nzl-businessnz`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-nzl-businessnz)
(New Zealand),
[`-9411-cze-spcr`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-cze-spcr)
(Czech Republic),
[`-9411-ind-cii`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ind-cii)
(India),
[`-9411-zaf-busa`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-zaf-busa)
(South Africa),
[`-9411-bra-cni`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-bra-cni)
(Brazil), and
[`-9411-ken-kam`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ken-kam)
(Kenya). Part of the
[`cloud-itonami`](https://github.com/cloud-itonami) compliance-fact
family (ADR-2607141700, `cloud-itonami-compliance-fact-federation`,
in `com-junkawasaki/root`).

## Sourcing note

This repo fills Canada's previously-open association-axis gap (one of
the 18-country gap list recorded at tick 144). Canada now has real,
individually verified facts across all three axes: country
([`cloud-itonami-iso3166-can`](https://github.com/cloud-itonami/cloud-itonami-iso3166-can)),
municipality
([`cloud-itonami-municipality-can-toronto`](https://github.com/cloud-itonami/cloud-itonami-municipality-can-toronto)),
and association (this repo).

Both entries here were directly WebFetch-verified against
`chamber.ca`'s own official "History" page, which rendered
successfully — no fallback needed. The 1925 founding date is
independently corroborated by Wikidata (Q132656646)'s own "inception"
statement.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on the Canadian
Chamber of Commerce's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Data

- `src/association/facts.cljc` — the catalog, source of truth.
- `schema/association-rule.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (query this
  alongside other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`).

Both entries directly WebFetch-verified against `chamber.ca`'s own
History page: the 1925 Winnipeg conference where business leaders
resolved to create a unified voice for Canadian commerce, and the
1926 First Annual Meeting in Saint John, New Brunswick, where the
organization became the Canadian Board of Trade.

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention). Policy text
itself remains the Canadian Chamber of Commerce's; this repo stores
only citation metadata (id/title/url/dates), not full text.
