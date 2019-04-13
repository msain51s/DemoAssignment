package com.demoassignment;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TestUtil {

    private static String articleData="{\n" +
            "    \"status\": \"OK\",\n" +
            "    \"copyright\": \"Copyright (c) 2019 The New York Times Company.  All Rights Reserved.\",\n" +
            "    \"num_results\": 1535,\n" +
            "    \"results\": [\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/interactive/2019/04/03/magazine/rupert-murdoch-fox-news-trump.html\",\n" +
            "            \"adx_keywords\": \"News and News Media;Presidential Election of 2016;United States Politics and Government;Cable Television;Regulation and Deregulation of Industry;Conservatism (US Politics);Antitrust Laws and Competition Issues;Family Business;21st Century Fox;Fox Broadcasting Co;Fox Entertainment Group Inc;Fox News Channel;New York Post;News Corporation;News of the World;Sky PLC;Sky Television;Sun, The (British Newspaper);Times of London;Twentieth Century Fox;Wall Street Journal;Hall, Jerry;Ailes, Roger E;Hannity, Sean;Murdoch, James R;Murdoch, Lachlan;Murdoch, Rupert;Trump, Donald J;Trump, Ivanka;Kushner, Jared;Australia;Great Britain;Great Britain Withdrawal from EU (Brexit)\",\n" +
            "            \"column\": \"\",\n" +
            "            \"section\": \"Magazine\",\n" +
            "            \"byline\": \"By JONATHAN MAHLER and JIM RUTENBERG\",\n" +
            "            \"type\": \"Interactive\",\n" +
            "            \"title\": \"How Rupert Murdoch’s Empire of Influence Remade the World\",\n" +
            "            \"abstract\": \"Murdoch and his children have toppled governments on two continents and destabilized the most important democracy on Earth. What do they want?\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006439740,\n" +
            "            \"asset_id\": 100000006439740,\n" +
            "            \"views\": 1,\n" +
            "            \"des_facet\": [\n" +
            "                \"NEWS AND NEWS MEDIA\",\n" +
            "                \"PRESIDENTIAL ELECTION OF 2016\",\n" +
            "                \"GREAT BRITAIN WITHDRAWAL FROM EU (BREXIT)\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"UNITED STATES POLITICS AND GOVERNMENT\",\n" +
            "                \"CABLE TELEVISION\",\n" +
            "                \"REGULATION AND DEREGULATION OF INDUSTRY\",\n" +
            "                \"CONSERVATISM (US POLITICS)\",\n" +
            "                \"ANTITRUST LAWS AND COMPETITION ISSUES\",\n" +
            "                \"FAMILY BUSINESS\",\n" +
            "                \"21ST CENTURY FOX\",\n" +
            "                \"FOX BROADCASTING CO\",\n" +
            "                \"FOX ENTERTAINMENT GROUP INC\",\n" +
            "                \"FOX NEWS CHANNEL\",\n" +
            "                \"NEW YORK POST\",\n" +
            "                \"NEWS CORPORATION\",\n" +
            "                \"NEWS OF THE WORLD\",\n" +
            "                \"SKY PLC\",\n" +
            "                \"SKY TELEVISION\",\n" +
            "                \"SUN, THE (BRITISH NEWSPAPER)\",\n" +
            "                \"TIMES OF LONDON\",\n" +
            "                \"TWENTIETH CENTURY FOX\",\n" +
            "                \"WALL STREET JOURNAL\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"HALL, JERRY\",\n" +
            "                \"AILES, ROGER E\",\n" +
            "                \"HANNITY, SEAN\",\n" +
            "                \"MURDOCH, JAMES R\",\n" +
            "                \"MURDOCH, LACHLAN\",\n" +
            "                \"MURDOCH, RUPERT\",\n" +
            "                \"TRUMP, DONALD J\",\n" +
            "                \"TRUMP, IVANKA\",\n" +
            "                \"KUSHNER, JARED\"\n" +
            "            ],\n" +
            "            \"geo_facet\": [\n" +
            "                \"AUSTRALIA\",\n" +
            "                \"GREAT BRITAIN\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"\",\n" +
            "                    \"copyright\": \"Photo illustration by Joan Wong\",\n" +
            "                    \"approved_for_syndication\": 0,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/07/magazine/07mag-murdoch-promo-image-1/07mag-murdoch-promo-image-1-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/07/magazine/07mag-murdoch-promo-image-1/07mag-murdoch-promo-image-1-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/07/magazine/07mag-murdoch-promo-image-1/07mag-murdoch-promo-image-1-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://interactive/1401f501-2f5c-5a0c-bee7-1a5b28dfc4e4\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/us/politics/william-barr-mueller-report.html\",\n" +
            "            \"adx_keywords\": \"United States Politics and Government;Russian Interference in 2016 US Elections and Ties to Trump Associates;Special Prosecutors (Independent Counsel);Attorneys General;Justice Department;Barr, William P;Mueller, Robert S III;Trump, Donald J\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"U.S.\",\n" +
            "            \"byline\": \"By NICHOLAS FANDOS, MICHAEL S. SCHMIDT and MARK MAZZETTI\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Some on Mueller’s Team Say Report Was More Damaging Than Barr Revealed\",\n" +
            "            \"abstract\": \"Members of the special counsel’s team have told associates that their findings are more troubling for President Trump than the attorney general indicated.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006441465,\n" +
            "            \"asset_id\": 100000006441465,\n" +
            "            \"views\": 2,\n" +
            "            \"des_facet\": [\n" +
            "                \"UNITED STATES POLITICS AND GOVERNMENT\",\n" +
            "                \"RUSSIAN INTERFERENCE IN 2016 US ELECTIONS AND TIES TO TRUMP ASSOCIATES\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"SPECIAL PROSECUTORS (INDEPENDENT COUNSEL)\",\n" +
            "                \"ATTORNEYS GENERAL\",\n" +
            "                \"JUSTICE DEPARTMENT\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"BARR, WILLIAM P\",\n" +
            "                \"MUELLER, ROBERT S III\",\n" +
            "                \"TRUMP, DONALD J\"\n" +
            "            ],\n" +
            "            \"geo_facet\": \"\",\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"Attorney General William P. Barr has shown hints of frustration with how the rollout of the special counsel’s chief findings has unfolded.\",\n" +
            "                    \"copyright\": \"Sarah Silbiger/The New York Times\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/politics/03dc-mueller/02dc-mueller-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/politics/03dc-mueller/02dc-mueller-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/politics/03dc-mueller/02dc-mueller-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/6d5ac849-af3f-5a1b-90f7-88f56c37dabd\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/02/opinion/brexit-news.html\",\n" +
            "            \"adx_keywords\": \"Great Britain Withdrawal from EU (Brexit);Conservative Party (Great Britain);European Union;Labour Party (Great Britain);Europe;May, Theresa M\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"Opinion\",\n" +
            "            \"byline\": \"By THOMAS L. FRIEDMAN\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"The United Kingdom Has Gone Mad\",\n" +
            "            \"abstract\": \"The problem with holding out for a perfect Brexit plan is that you can’t fix stupid.\",\n" +
            "            \"published_date\": \"2019-04-02\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006442243,\n" +
            "            \"asset_id\": 100000006442243,\n" +
            "            \"views\": 3,\n" +
            "            \"des_facet\": \"\",\n" +
            "            \"org_facet\": [\n" +
            "                \"GREAT BRITAIN WITHDRAWAL FROM EU (BREXIT)\",\n" +
            "                \"CONSERVATIVE PARTY (GREAT BRITAIN)\",\n" +
            "                \"EUROPEAN UNION\",\n" +
            "                \"LABOUR PARTY (GREAT BRITAIN)\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"MAY, THERESA M\"\n" +
            "            ],\n" +
            "            \"geo_facet\": [\n" +
            "                \"EUROPE\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"A protester shouting from a lamppost on Friday outside the Houses of Parliament in London.\",\n" +
            "                    \"copyright\": \"Hannah Mckay/Reuters\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/opinion/02friedmanWeb/02friedmanWeb-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/opinion/02friedmanWeb/02friedmanWeb-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/opinion/02friedmanWeb/02friedmanWeb-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/7a1bc10b-65d5-568e-afde-a4e817fd2b17\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/us/politics/mueller-report-subpoena-house.html\",\n" +
            "            \"adx_keywords\": \"United States Politics and Government;Russian Interference in 2016 US Elections and Ties to Trump Associates;Special Prosecutors (Independent Counsel);House Committee on the Judiciary;Mueller, Robert S III;Trump, Donald J\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"U.S.\",\n" +
            "            \"byline\": \"By NICHOLAS FANDOS\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"House Democrat Demands Six Years of Trump Tax Returns From I.R.S.\",\n" +
            "            \"abstract\": \"The House Ways and Means Committee chairman, using an obscure provision in the tax code, formally demanded President Trump’s personal and business tax returns, most likely starting a momentous fight.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006442665,\n" +
            "            \"asset_id\": 100000006442665,\n" +
            "            \"views\": 4,\n" +
            "            \"des_facet\": [\n" +
            "                \"UNITED STATES POLITICS AND GOVERNMENT\",\n" +
            "                \"RUSSIAN INTERFERENCE IN 2016 US ELECTIONS AND TIES TO TRUMP ASSOCIATES\",\n" +
            "                \"SPECIAL PROSECUTORS (INDEPENDENT COUNSEL)\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"HOUSE COMMITTEE ON THE JUDICIARY\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"MUELLER, ROBERT S III\",\n" +
            "                \"TRUMP, DONALD J\"\n" +
            "            ],\n" +
            "            \"geo_facet\": \"\",\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"The move by Representative Richard E. Neal, right, the chairman of the Ways and Means Committee, came as other panels controlled by House Democrats were flexing their muscles.\",\n" +
            "                    \"copyright\": \"Tom Brenner for The New York Times\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/us/politics/03dc-report1-sub2/03dc-report1-sub2-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/us/politics/03dc-report1-sub2/merlin_149024247_98b54dbc-d482-4342-9c91-52e5c1fb1e62-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/us/politics/03dc-report1-sub2/merlin_149024247_98b54dbc-d482-4342-9c91-52e5c1fb1e62-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/c750c72e-1b1a-52b6-b247-46361dbc2a3e\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/interactive/2019/04/03/magazine/murdoch-family-investigation.html\",\n" +
            "            \"adx_keywords\": \"News and News Media;Politics and Government;Presidential Election of 2016;Television;United States Politics and Government;21st Century Fox;British Sky Broadcasting Group;Fox Entertainment Group Inc;Fox News Channel;News Corporation;Sky News;Sky PLC;Sun, The (British Newspaper);Walt Disney Company;Murdoch, James R;Murdoch, Lachlan;Murdoch, Rupert;Trump, Donald J\",\n" +
            "            \"column\": \"\",\n" +
            "            \"section\": \"Magazine\",\n" +
            "            \"byline\": \"By LIAM STACK\",\n" +
            "            \"type\": \"Interactive\",\n" +
            "            \"title\": \"6 Takeaways From The Times’s Investigation Into Rupert Murdoch and His Family\",\n" +
            "            \"abstract\": \"Using 150 interviews on three continents, The Times describes the Murdoch family’s role in destabilizing democracy in North America, Europe and Australia.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006439809,\n" +
            "            \"asset_id\": 100000006439809,\n" +
            "            \"views\": 5,\n" +
            "            \"des_facet\": [\n" +
            "                \"NEWS AND NEWS MEDIA\",\n" +
            "                \"POLITICS AND GOVERNMENT\",\n" +
            "                \"PRESIDENTIAL ELECTION OF 2016\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"TELEVISION\",\n" +
            "                \"UNITED STATES POLITICS AND GOVERNMENT\",\n" +
            "                \"21ST CENTURY FOX\",\n" +
            "                \"BRITISH SKY BROADCASTING GROUP\",\n" +
            "                \"FOX ENTERTAINMENT GROUP INC\",\n" +
            "                \"FOX NEWS CHANNEL\",\n" +
            "                \"NEWS CORPORATION\",\n" +
            "                \"SKY NEWS\",\n" +
            "                \"SKY PLC\",\n" +
            "                \"SUN, THE (BRITISH NEWSPAPER)\",\n" +
            "                \"WALT DISNEY COMPANY\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"MURDOCH, JAMES R\",\n" +
            "                \"MURDOCH, LACHLAN\",\n" +
            "                \"MURDOCH, RUPERT\",\n" +
            "                \"TRUMP, DONALD J\"\n" +
            "            ],\n" +
            "            \"geo_facet\": \"\",\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"\",\n" +
            "                    \"copyright\": \"Margaret Cheatham Williams/The New York Times\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/30/autossell/Fox-cover/Fox-cover-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/30/autossell/Fox-cover/Fox-cover-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/30/autossell/Fox-cover/Fox-cover-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://interactive/dc558f0f-9390-5aa0-b056-9836a2c41e5d\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/world/asia/brunei-stoning-gay-sex.html\",\n" +
            "            \"adx_keywords\": \"Human Rights and Human Rights Violations;Politics and Government;Discrimination;Adultery;Homosexuality and Bisexuality;Celebrities;Boycotts;Shariah (Islamic Law);Capital Punishment;Amputation;Muslims and Islam;Brunei;Death and Dying\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"World\",\n" +
            "            \"byline\": \"By ILIANA MAGRA\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Brunei Stoning Punishment for Gay Sex and Adultery Takes Effect Despite International Outcry\",\n" +
            "            \"abstract\": \"Harsh punishments based on a version of Shariah, or Islamic law, which also include amputations and whippings, have prompted an international outcry.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006443075,\n" +
            "            \"asset_id\": 100000006443075,\n" +
            "            \"views\": 6,\n" +
            "            \"des_facet\": [\n" +
            "                \"HUMAN RIGHTS AND HUMAN RIGHTS VIOLATIONS\",\n" +
            "                \"POLITICS AND GOVERNMENT\",\n" +
            "                \"DISCRIMINATION\",\n" +
            "                \"DEATH AND DYING\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"ADULTERY\",\n" +
            "                \"HOMOSEXUALITY AND BISEXUALITY\",\n" +
            "                \"CELEBRITIES\",\n" +
            "                \"BOYCOTTS\",\n" +
            "                \"SHARIAH (ISLAMIC LAW)\",\n" +
            "                \"CAPITAL PUNISHMENT\",\n" +
            "                \"AMPUTATION\",\n" +
            "                \"MUSLIMS AND ISLAM\"\n" +
            "            ],\n" +
            "            \"per_facet\": \"\",\n" +
            "            \"geo_facet\": [\n" +
            "                \"BRUNEI\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"Sultan Hassanal Bolkiah of Brunei in Bandar Seri Begawan, the country’s capital, on Wednesday.\",\n" +
            "                    \"copyright\": \"EPA, via Shutterstock\",\n" +
            "                    \"approved_for_syndication\": 0,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/world/03brunei1/03brunei1-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/world/03brunei1/03brunei1-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/world/03brunei1/03brunei1-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/bfeff4c6-6901-5dab-b4b3-51b25df1df30\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/us/usc-admissions-scandal-students.html\",\n" +
            "            \"adx_keywords\": \"University of Southern California;Colleges and Universities;Los Angeles (Calif);Fraternities and Sororities;Admissions Standards;Income\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"U.S.\",\n" +
            "            \"byline\": \"By JENNIFER MEDINA\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"What’s Life Like as a Student at U.S.C.? Depends on the Size of the Bank Account\",\n" +
            "            \"abstract\": \"As U.S.C. has fought to attract low-income students, the campus has become a vivid microcosm of the economic disparities in Los Angeles.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006439204,\n" +
            "            \"asset_id\": 100000006439204,\n" +
            "            \"views\": 7,\n" +
            "            \"des_facet\": [\n" +
            "                \"COLLEGES AND UNIVERSITIES\",\n" +
            "                \"FRATERNITIES AND SORORITIES\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"UNIVERSITY OF SOUTHERN CALIFORNIA\",\n" +
            "                \"ADMISSIONS STANDARDS\",\n" +
            "                \"INCOME\"\n" +
            "            ],\n" +
            "            \"per_facet\": \"\",\n" +
            "            \"geo_facet\": [\n" +
            "                \"LOS ANGELES (CALIF)\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"“I have met these rich kids who have so much that I can’t comprehend, doing things that I can’t fathom,” said Oliver Bentley, a sophomore at the University of Southern California.\",\n" +
            "                    \"copyright\": \"Jenna Schoenefeld for The New York Times\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/01/us/00divide1/00divide1-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/01/us/00divide1/merlin_152918448_b378295e-0936-4417-bd10-7bed7adcb6c2-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/01/us/00divide1/merlin_152918448_b378295e-0936-4417-bd10-7bed7adcb6c2-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/0311cc79-0f6a-5d24-886a-640a6d0d4ba3\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/world/europe/turkey-istanbul-erdogan-ekrem-imamoglu.html\",\n" +
            "            \"adx_keywords\": \"Politics and Government;Local Government;Government Contracts and Procurement;Elections, Mayors;Bribery and Kickbacks;Nepotism;Erdogan, Recep Tayyip;Imamoglu, Ekrem;Istanbul (Turkey)\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"World\",\n" +
            "            \"byline\": \"By CARLOTTA GALL\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Erdogan’s Opponents Promise Scrutiny of Istanbul’s Books After Turkey Elections\",\n" +
            "            \"abstract\": \"Losing Istanbul in Sunday’s vote could cost Turkey’s president and his party. Opponents say they have warped the local economy through crony schemes.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006441470,\n" +
            "            \"asset_id\": 100000006441470,\n" +
            "            \"views\": 8,\n" +
            "            \"des_facet\": [\n" +
            "                \"POLITICS AND GOVERNMENT\",\n" +
            "                \"LOCAL GOVERNMENT\",\n" +
            "                \"GOVERNMENT CONTRACTS AND PROCUREMENT\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"ELECTIONS, MAYORS\",\n" +
            "                \"BRIBERY AND KICKBACKS\",\n" +
            "                \"NEPOTISM\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"ERDOGAN, RECEP TAYYIP\",\n" +
            "                \"IMAMOGLU, EKREM\"\n" +
            "            ],\n" +
            "            \"geo_facet\": [\n" +
            "                \"ISTANBUL (TURKEY)\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"Ekrem Imamoglu, second from left, who claimed victory in Istanbul’s mayoral election, and Mansur Yavas, second from right, who claimed victory in Ankara, along with other members of the opposition Republican People’s Party.\",\n" +
            "                    \"copyright\": \"Adem Altan/Agence France-Presse — Getty Images\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/world/03turkey-elect1/03turkey-elect1-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/world/03turkey-elect1/03turkey-elect1-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/world/03turkey-elect1/03turkey-elect1-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/ca8f98b3-3ae0-543f-bc3c-23026a551119\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/02/us/politics/joe-biden-women-me-too.html\",\n" +
            "            \"adx_keywords\": \"Biden, Joseph R Jr;Presidential Election of 2020;United States Politics and Government;#MeToo Movement;Sexual Harassment;Women and Girls\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"U.S.\",\n" +
            "            \"byline\": \"By SHERYL GAY STOLBERG and SYDNEY EMBER\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Biden’s Tactile Politics Threaten His Return in the #MeToo Era\",\n" +
            "            \"abstract\": \"In a political career that stretches 50 years, Joseph R. Biden Jr. has been a master of an in-your-space intimacy that is proving to be a liability.\",\n" +
            "            \"published_date\": \"2019-04-02\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006441612,\n" +
            "            \"asset_id\": 100000006441612,\n" +
            "            \"views\": 9,\n" +
            "            \"des_facet\": [\n" +
            "                \"PRESIDENTIAL ELECTION OF 2020\",\n" +
            "                \"UNITED STATES POLITICS AND GOVERNMENT\",\n" +
            "                \"#METOO MOVEMENT\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"SEXUAL HARASSMENT\",\n" +
            "                \"WOMEN AND GIRLS\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"BIDEN, JOSEPH R JR\"\n" +
            "            ],\n" +
            "            \"geo_facet\": \"\",\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"Vice President Joseph R. Biden Jr. during a campaign stop in Seaman, Ohio, in 2012. The accusations against Mr. Biden feed into a narrative that he is a relic of the past, unsuited to represent his party in the modern era.\",\n" +
            "                    \"copyright\": \"Carolyn Kaster/Associated Press\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/politics/02biden-1/02biden-1-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/politics/02biden-1/02biden-1-mediumThreeByTwo210-v3.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/politics/02biden-1/02biden-1-mediumThreeByTwo440-v3.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/4e5eb2ca-75f5-5428-a712-8c60bf56461e\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/us/transatlantic-slave-trade-last-survivor.html\",\n" +
            "            \"adx_keywords\": \"Slavery (Historical);Newcastle University;Hurston, Zora Neale;Alabama;Africa\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"U.S.\",\n" +
            "            \"byline\": \"By SANDRA E. GARCIA\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"She Survived a Slave Ship, the Civil War and the Depression. Her Name Was Redoshi.\",\n" +
            "            \"abstract\": \"New research suggests that Redoshi, who became a free woman in 1865, may have been the last living survivor of the trans-Atlantic slave trade.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006439416,\n" +
            "            \"asset_id\": 100000006439416,\n" +
            "            \"views\": 10,\n" +
            "            \"des_facet\": [\n" +
            "                \"SLAVERY (HISTORICAL)\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"NEWCASTLE UNIVERSITY\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"HURSTON, ZORA NEALE\"\n" +
            "            ],\n" +
            "            \"geo_facet\": [\n" +
            "                \"ALABAMA\",\n" +
            "                \"AFRICA\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"Redoshi, who was known as Sally Smith after she became enslaved, with her husband, called Uncle Billy or Yawith.\",\n" +
            "                    \"copyright\": \"via Shirley Quarles\",\n" +
            "                    \"approved_for_syndication\": 0,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/01/us/01xp-slavetrade/01xp-slavetrade-thumbStandard-v2.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/01/us/01xp-slavetrade/01xp-slavetrade-mediumThreeByTwo210-v2.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/01/us/01xp-slavetrade/01xp-slavetrade-mediumThreeByTwo440-v2.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/aca5f12c-c6f2-58dc-9e1f-7f307fa2faf4\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/us/politics/trump-republican-party.html\",\n" +
            "            \"adx_keywords\": \"United States Politics and Government;Presidential Election of 2020;Republican National Committee;Republican Party;Trump, Donald J\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"U.S.\",\n" +
            "            \"byline\": \"By ALEXANDER BURNS and JONATHAN MARTIN\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Trump’s Takeover of the Republican Party Is Almost Complete\",\n" +
            "            \"abstract\": \"The Trump campaign has helped install allies atop the most significant state parties, and has urged them to discourage conservative criticism of the president.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006428638,\n" +
            "            \"asset_id\": 100000006428638,\n" +
            "            \"views\": 11,\n" +
            "            \"des_facet\": [\n" +
            "                \"UNITED STATES POLITICS AND GOVERNMENT\",\n" +
            "                \"PRESIDENTIAL ELECTION OF 2020\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"REPUBLICAN NATIONAL COMMITTEE\",\n" +
            "                \"REPUBLICAN PARTY\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"TRUMP, DONALD J\"\n" +
            "            ],\n" +
            "            \"geo_facet\": \"\",\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"Supporters of President Trump at a rally in Grand Rapids, Mich., on Thursday. The Trump campaign has helped install allies in every state important to the 2020 race.\",\n" +
            "                    \"copyright\": \"Tom Brenner for The New York Times\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/29/us/politics/00trumpgop3/00trumpgop3-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/29/us/politics/00trumpgop3/merlin_152750256_d8ec1331-f723-4cd7-8565-7b26f832f1f6-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/29/us/politics/00trumpgop3/merlin_152750256_d8ec1331-f723-4cd7-8565-7b26f832f1f6-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/ce4afcdb-26a1-53f4-a86a-15003f74eaef\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/02/us/chicago-election-results.html\",\n" +
            "            \"adx_keywords\": \"Elections, Mayors;Chicago (Ill);Lightfoot, Lori;Preckwinkle, Toni;Emanuel, Rahm;Blacks;Race and Ethnicity\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"U.S.\",\n" +
            "            \"byline\": \"By JULIE BOSMAN, MITCH SMITH and MONICA DAVEY\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Lori Lightfoot Is Elected Chicago Mayor, Becoming First Black Woman to Lead City\",\n" +
            "            \"abstract\": \"Ms. Lightfoot, a former federal prosecutor, ran as an outsider in a city that has often picked insiders. She is also Chicago’s first openly gay mayor.\",\n" +
            "            \"published_date\": \"2019-04-02\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006441302,\n" +
            "            \"asset_id\": 100000006441302,\n" +
            "            \"views\": 12,\n" +
            "            \"des_facet\": [\n" +
            "                \"ELECTIONS, MAYORS\",\n" +
            "                \"BLACKS\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"RACE AND ETHNICITY\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"LIGHTFOOT, LORI\",\n" +
            "                \"PRECKWINKLE, TONI\",\n" +
            "                \"EMANUEL, RAHM\"\n" +
            "            ],\n" +
            "            \"geo_facet\": [\n" +
            "                \"CHICAGO (ILL)\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"Lori Lightfoot, a former prosecutor, will become the first black woman to lead Chicago when she succeeds Rahm Emanuel in May. Ms. Lightfoot, who easily won a runoff election on Tuesday, also will be the city’s first openly gay mayor.\",\n" +
            "                    \"copyright\": \"Michelle V. Agins/The New York Times\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/02chicagoresults7/02chicagoresults7-thumbStandard-v2.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/02chicagoresults7/02chicagoresults7-mediumThreeByTwo210-v2.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/02chicagoresults7/02chicagoresults7-mediumThreeByTwo440-v2.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/576a936f-7b77-5b87-b0f9-41c253f52841\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/us/felicity-huffman-lori-loughlin-college-admissions-scandal.html\",\n" +
            "            \"adx_keywords\": \"College Admissions Scandal (2019);Tests and Examinations;Colleges and Universities;Admissions Standards\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"U.S.\",\n" +
            "            \"byline\": \"By KATE TAYLOR\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Felicity Huffman and Lori Loughlin Appear in Court as College Admissions Scandal Rewrites Lives\",\n" +
            "            \"abstract\": \"Some of the 33 parents who are charged in the college admissions scandal have lost jobs, had book contracts canceled and television shows scrapped.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006441813,\n" +
            "            \"asset_id\": 100000006441813,\n" +
            "            \"views\": 13,\n" +
            "            \"des_facet\": [\n" +
            "                \"TESTS AND EXAMINATIONS\",\n" +
            "                \"COLLEGES AND UNIVERSITIES\",\n" +
            "                \"ADMISSIONS STANDARDS\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"COLLEGE ADMISSIONS SCANDAL (2019)\"\n" +
            "            ],\n" +
            "            \"per_facet\": \"\",\n" +
            "            \"geo_facet\": \"\",\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"The actress Felicity Huffman, center, leaving federal court in Boston on Wednesday. She is accused of paying $15,000 to a college admissions consultant to cheat on her daughter’s SAT.<br /><br />\",\n" +
            "                    \"copyright\": \"Sarah Rice for The New York Times\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/us/03parents01-subalt/03parents01-subalt-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/us/03parents01-subalt/merlin_153023955_bd5afdc6-70e1-4bf4-a869-778db10f6981-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/us/03parents01-subalt/merlin_153023955_bd5afdc6-70e1-4bf4-a869-778db10f6981-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/7567cbc7-cc01-57bd-a1d7-998d4e6c765a\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/opinion/pete-buttigieg-joe-biden.html\",\n" +
            "            \"adx_keywords\": \"Buttigieg, Pete (1982- );Biden, Joseph R Jr;Democratic Party;Presidential Election of 2020\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"Opinion\",\n" +
            "            \"byline\": \"By FRANK BRUNI\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Mayor Pete Is Plenty Gay\",\n" +
            "            \"abstract\": \"And Democrats better not eat their own.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006443650,\n" +
            "            \"asset_id\": 100000006443650,\n" +
            "            \"views\": 14,\n" +
            "            \"des_facet\": [\n" +
            "                \"PRESIDENTIAL ELECTION OF 2020\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"DEMOCRATIC PARTY\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"BUTTIGIEG, PETE (1982- )\",\n" +
            "                \"BIDEN, JOSEPH R JR\"\n" +
            "            ],\n" +
            "            \"geo_facet\": \"\",\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"Pete Buttigieg at a fundraiser in Manhattan in March.\",\n" +
            "                    \"copyright\": \"Stephanie Keith for The New York Times\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/opinion/03newsletterBruni/03newsletterBruni-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/opinion/03newsletterBruni/03newsletterBruni-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/opinion/03newsletterBruni/03newsletterBruni-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/38be4e80-f001-5af2-9535-32174339b05b\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/02/us/mar-a-lago-zhang-chinese-secret-service.html\",\n" +
            "            \"adx_keywords\": \"Cyberattacks and Hackers;Mar-a-Lago (Palm Beach, Fla);Trump, Donald J;Florida;China\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"U.S.\",\n" +
            "            \"byline\": \"By FRANCES ROBLES\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Woman From China Carrying Malware Arrested After Entering Mar-a-Lago\",\n" +
            "            \"abstract\": \"Federal authorities have arrested a 32-year-old Chinese woman who allegedly made false statements when she sought to enter Mar-a-Lago over the weekend.\",\n" +
            "            \"published_date\": \"2019-04-02\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006442150,\n" +
            "            \"asset_id\": 100000006442150,\n" +
            "            \"views\": 15,\n" +
            "            \"des_facet\": [\n" +
            "                \"CYBERATTACKS AND HACKERS\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"MAR-A-LAGO (PALM BEACH, FLA)\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"TRUMP, DONALD J\"\n" +
            "            ],\n" +
            "            \"geo_facet\": [\n" +
            "                \"FLORIDA\",\n" +
            "                \"CHINA\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"Mar-a-Lago, President Trump’s club in Palm Beach, Fla.\",\n" +
            "                    \"copyright\": \"Doug Mills/The New York Times\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/02mar-a-lago/02mar-a-lago-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/02mar-a-lago/merlin_137024865_65aa8f7b-7478-47d8-bab0-a1f40d7440ca-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/us/02mar-a-lago/merlin_137024865_65aa8f7b-7478-47d8-bab0-a1f40d7440ca-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/d6b8532f-9234-5861-8441-91afe8480d90\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/nyregion/teacher-selfie.html\",\n" +
            "            \"adx_keywords\": \"Photography;Discrimination;Women's Rights;Nudism and Nudity;Suits and Litigation (Civil);Teachers and School Employees;Long Island (NY);Lauren Miranda;Bellport Middle School\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"New York\",\n" +
            "            \"byline\": \"By MICHAEL GOLD\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"A Teacher Is Fired Over a Topless Selfie, Stirring a Debate Over Gender Equity\",\n" +
            "            \"abstract\": \"Lauren Miranda, 25, was fired from a Long Island school after a student obtained a topless selfie she said she had sent to a teacher she had dated.\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006443356,\n" +
            "            \"asset_id\": 100000006443356,\n" +
            "            \"views\": 16,\n" +
            "            \"des_facet\": [\n" +
            "                \"PHOTOGRAPHY\",\n" +
            "                \"DISCRIMINATION\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"WOMEN'S RIGHTS\",\n" +
            "                \"NUDISM AND NUDITY\",\n" +
            "                \"SUITS AND LITIGATION (CIVIL)\",\n" +
            "                \"TEACHERS AND SCHOOL EMPLOYEES\",\n" +
            "                \"BELLPORT MIDDLE SCHOOL\"\n" +
            "            ],\n" +
            "            \"per_facet\": [\n" +
            "                \"LAUREN MIRANDA\"\n" +
            "            ],\n" +
            "            \"geo_facet\": [\n" +
            "                \"LONG ISLAND (NY)\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"Lauren Miranda, 25, was fired from her job as a math teacher after a student obtained a topless selfie that she said she sent only to a fellow teacher she had been dating.\",\n" +
            "                    \"copyright\": \"Samantha Starr\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/04/nyregion/04teacherselfie-print/03teacherselfie-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/04/nyregion/04teacherselfie-print/03teacherselfie-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/04/nyregion/04teacherselfie-print/03teacherselfie-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/05ddc25a-cbaf-5fb6-afc4-5d2cbe87c602\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/us/alabama-prisons-doj-investigation.html\",\n" +
            "            \"adx_keywords\": \"Prisons and Prisoners;Justice Department;Alabama\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"U.S.\",\n" +
            "            \"byline\": \"By KATIE BENNER and SHAILA DEWAN\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Alabama’s Gruesome Prisons: Report Finds Rape and Murder at All Hours\",\n" +
            "            \"abstract\": \"In a grim report on the Alabama prison system, the Justice Department detailed violence that was “common, cruel,” and “of an unusual nature.”\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006443359,\n" +
            "            \"asset_id\": 100000006443359,\n" +
            "            \"views\": 17,\n" +
            "            \"des_facet\": [\n" +
            "                \"PRISONS AND PRISONERS\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"JUSTICE DEPARTMENT\"\n" +
            "            ],\n" +
            "            \"per_facet\": \"\",\n" +
            "            \"geo_facet\": [\n" +
            "                \"ALABAMA\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"The segregation unit at Alabama’s St. Clair Correctional Facility houses inmates in solitary confinement. Many have come to see the unit as a haven from the prison’s general population.\",\n" +
            "                    \"copyright\": \"William Widmer for The New York Times\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/us/03alabama/03alabama-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/us/03alabama/merlin_118280726_b705de7f-39f7-42f9-a89c-e559543fc05a-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/03/us/03alabama/merlin_118280726_b705de7f-39f7-42f9-a89c-e559543fc05a-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/169f6518-3e04-5e41-bcca-22714f64ad7e\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/03/25/smarter-living/why-you-procrastinate-it-has-nothing-to-do-with-self-control.html\",\n" +
            "            \"adx_keywords\": \"Procrastination;Emotions;Psychology and Psychologists;Anxiety and Stress;Boredom\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"Smarter Living\",\n" +
            "            \"byline\": \"By CHARLOTTE LIEBERMAN\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Why You Procrastinate (It Has Nothing to Do With Self-Control)\",\n" +
            "            \"abstract\": \"If procrastination isn’t about laziness, then what is it about?\",\n" +
            "            \"published_date\": \"2019-03-25\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006416140,\n" +
            "            \"asset_id\": 100000006416140,\n" +
            "            \"views\": 18,\n" +
            "            \"des_facet\": [\n" +
            "                \"PROCRASTINATION\",\n" +
            "                \"PSYCHOLOGY AND PSYCHOLOGISTS\",\n" +
            "                \"ANXIETY AND STRESS\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"EMOTIONS\",\n" +
            "                \"BOREDOM\"\n" +
            "            ],\n" +
            "            \"per_facet\": \"\",\n" +
            "            \"geo_facet\": \"\",\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"\",\n" +
            "                    \"copyright\": \"Erik Winkowski\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/25/smarter-living/25sl_procrastination_promo/25sl_procrastination_promo-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/25/smarter-living/25sl_procrastination_promo/25sl_procrastination_promo-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/25/smarter-living/25sl_procrastination_promo/25sl_procrastination_promo-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/166a9d7f-8edd-5ae8-88e5-30a6e80e646e\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/03/28/smarter-living/productivity-isnt-about-time-management-its-about-attention-management.html\",\n" +
            "            \"adx_keywords\": \"Creativity;Boredom;attention;Productivity\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"Smarter Living\",\n" +
            "            \"byline\": \"By ADAM GRANT\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"Productivity Isn’t About Time Management. It’s About Attention Management.\",\n" +
            "            \"abstract\": \"“Time management” is not a solution — it’s actually part of the problem.\",\n" +
            "            \"published_date\": \"2019-03-28\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006417921,\n" +
            "            \"asset_id\": 100000006417921,\n" +
            "            \"views\": 19,\n" +
            "            \"des_facet\": [\n" +
            "                \"BOREDOM\",\n" +
            "                \"PRODUCTIVITY\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"CREATIVITY\"\n" +
            "            ],\n" +
            "            \"per_facet\": \"\",\n" +
            "            \"geo_facet\": \"\",\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"\",\n" +
            "                    \"copyright\": \"Erik Winkowski\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/25/smarter-living/25sl_attention_promo/25sl_attention_promo-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/25/smarter-living/25sl_attention_promo/25sl_attention_promo-mediumThreeByTwo210.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/03/25/smarter-living/25sl_attention_promo/25sl_attention_promo-mediumThreeByTwo440.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/11a45c01-f2f2-50c8-928e-540da71b337a\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"url\": \"https://www.nytimes.com/2019/04/03/world/philippines-hotel-influencers-social-media.html\",\n" +
            "            \"adx_keywords\": \"Social Media;Computers and the Internet;Beaches;Philippines\",\n" +
            "            \"column\": null,\n" +
            "            \"section\": \"World\",\n" +
            "            \"byline\": \"By HEATHER MURPHY\",\n" +
            "            \"type\": \"Article\",\n" +
            "            \"title\": \"No, Your Instagram ‘Influence’ Is Not as Good as Cash, Club Owner Says\",\n" +
            "            \"abstract\": \"A man who runs a beach club in the Philippines took a stand against “wannabe freeloaders.”\",\n" +
            "            \"published_date\": \"2019-04-03\",\n" +
            "            \"source\": \"The New York Times\",\n" +
            "            \"id\": 100000006441424,\n" +
            "            \"asset_id\": 100000006441424,\n" +
            "            \"views\": 20,\n" +
            "            \"des_facet\": [\n" +
            "                \"SOCIAL MEDIA\"\n" +
            "            ],\n" +
            "            \"org_facet\": [\n" +
            "                \"COMPUTERS AND THE INTERNET\",\n" +
            "                \"BEACHES\"\n" +
            "            ],\n" +
            "            \"per_facet\": \"\",\n" +
            "            \"geo_facet\": [\n" +
            "                \"PHILIPPINES\"\n" +
            "            ],\n" +
            "            \"media\": [\n" +
            "                {\n" +
            "                    \"type\": \"image\",\n" +
            "                    \"subtype\": \"photo\",\n" +
            "                    \"caption\": \"The White Banana Beach Club does not want you to pay for your cocktail in content.\",\n" +
            "                    \"copyright\": \"White Banana Beach Club Siargao\",\n" +
            "                    \"approved_for_syndication\": 1,\n" +
            "                    \"media-metadata\": [\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/business/02xp-influencer1/02xp-influencer1-thumbStandard.jpg\",\n" +
            "                            \"format\": \"Standard Thumbnail\",\n" +
            "                            \"height\": 75,\n" +
            "                            \"width\": 75\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/business/02xp-influencer1/02xp-influencer1-mediumThreeByTwo210-v2.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo210\",\n" +
            "                            \"height\": 140,\n" +
            "                            \"width\": 210\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"url\": \"https://static01.nyt.com/images/2019/04/02/business/02xp-influencer1/02xp-influencer1-mediumThreeByTwo440-v2.jpg\",\n" +
            "                            \"format\": \"mediumThreeByTwo440\",\n" +
            "                            \"height\": 293,\n" +
            "                            \"width\": 440\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ],\n" +
            "            \"uri\": \"nyt://article/c680a8e4-c2b9-5d54-85a7-fb491117c1c5\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";


    public static  JsonObject articleJsonData= (JsonObject) new JsonParser().parse(articleData);
}
