﻿# Nouvelle instance de base
CREATE DATABASE `MESPAYS`;

# Activation de la base
USE `MESPAYS`;

# Table du TP
CREATE TABLE `pays` (
  `NOM_PAYS` varchar(100) NOT NULL,
  `NOM_CAPITALE` varchar(100) NOT NULL,
  `NB_HABITANTS` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`NOM_PAYS`),
  UNIQUE KEY `NOM_PAYS` (`NOM_PAYS`),
  UNIQUE KEY `NOM_CAPITALE` (`NOM_CAPITALE`)
) ;

# Valeurs du TP
INSERT INTO pays VALUES ('COTE D IVOIRE', 'Abidjan', 10000);
INSERT INTO pays VALUES ('EMIRATS ARABES UNIS', 'Abou Dhabi', 20000);
INSERT INTO pays VALUES ('NIGERIA', 'Abuja', 30000);
INSERT INTO pays VALUES ('GHANA', 'Accra', 40000);
INSERT INTO pays VALUES ('TURKMENISTAN', 'Achgabat', 50000);
INSERT INTO pays VALUES ('ETHIOPIE', 'Addis-Abeba', 60000);
INSERT INTO pays VALUES ('ALGERIE', 'Alger', 70000);
INSERT INTO pays VALUES ('KAZAKHSTAN', 'Astana', 80000);
INSERT INTO pays VALUES ('JORDANIE', 'Amman', 90000);
INSERT INTO pays VALUES ('PAYS-BAS', 'Amsterdam', 100000);
INSERT INTO pays VALUES ('ANDORRE', 'Andorre-la-Vieille', 110000);
INSERT INTO pays VALUES ('TURQUIE', 'Ankara', 120000);
INSERT INTO pays VALUES ('MADAGASCAR', 'Antananarivo', 130000);
INSERT INTO pays VALUES ('SAMOA', 'Apia', 140000);
INSERT INTO pays VALUES ('ERYTHREE', 'Asmara', 150000);
INSERT INTO pays VALUES ('PARAGUAY', 'Asuncion ', 170000);
INSERT INTO pays VALUES ('GRECE', 'Athènes', 180000);
INSERT INTO pays VALUES ('IRAK', 'Bagdad', 190000);
INSERT INTO pays VALUES ('AZERBAIDJAN', 'Bakou', 200000);
INSERT INTO pays VALUES ('MALI', 'Bamako', 220000);
INSERT INTO pays VALUES ('BRUNEI', 'Bandar Seri Begawan', 230000);
INSERT INTO pays VALUES ('THAILANDE', 'Bangkok', 240000);
INSERT INTO pays VALUES ('CENTRAFRIQUE', 'Bangui', 250000);
INSERT INTO pays VALUES ('GAMBIE', 'Banjul', 260000);
INSERT INTO pays VALUES ('SAINT-CHRISTOPHE-ET-NIEVES', 'Basseterre', 270000);
INSERT INTO pays VALUES ('SERBIE', 'Belgrade', 280000);
INSERT INTO pays VALUES ('BELIZE', 'Belmopan', 290000);
INSERT INTO pays VALUES ('ALLEMAGNE', 'Berlin', 300000);
INSERT INTO pays VALUES ('SUISSE', 'Berne', 310000);
INSERT INTO pays VALUES ('LIBAN', 'Beyrouth', 320000);
INSERT INTO pays VALUES ('KIRGHIZSTAN', 'Bichkek', 330000);
INSERT INTO pays VALUES ('GUINEE-BISSAU', 'Bissau', 340000);
INSERT INTO pays VALUES ('COLOMBIE', 'Bogota', 350000);
INSERT INTO pays VALUES ('BRESIL', 'Brasilia', 360000);
INSERT INTO pays VALUES ('SLOVAQUIE', 'Bratislava', 370000);
INSERT INTO pays VALUES ('CONGO', 'Brazzaville', 380000);
INSERT INTO pays VALUES ('BARBADE', 'Bridgetown', 390000);
INSERT INTO pays VALUES ('BELGIQUE', 'Bruxelles', 400000);
INSERT INTO pays VALUES ('ROUMANIE', 'Bucarest', 410000);
INSERT INTO pays VALUES ('HONGRIE', 'Budapest', 420000);
INSERT INTO pays VALUES ('ARGENTINE', 'Buenos Aires', 430000);
INSERT INTO pays VALUES ('BURUNDI', 'Bujumbura', 440000);
INSERT INTO pays VALUES ('EGYPTE', 'Le Caire', 450000);
INSERT INTO pays VALUES ('AUSTRALIE', 'Canberra', 460000);
INSERT INTO pays VALUES ('VENEZUELA', 'Caracas', 480000);
INSERT INTO pays VALUES ('SAINTE-LUCIE', 'Castries', 490000);
INSERT INTO pays VALUES ('MOLDAVIE', 'Chisinau', 500000);
INSERT INTO pays VALUES ('SRI LANKA', 'Colombo', 510000);
INSERT INTO pays VALUES ('GUINEE', 'Conakry', 520000);
INSERT INTO pays VALUES ('DANEMARK', 'Copenhague', 530000);
INSERT INTO pays VALUES ('BENIN', 'Cotonou', 540000);
INSERT INTO pays VALUES ('BANGLADESH', 'Dacca', 560000);
INSERT INTO pays VALUES ('SENEGAL', 'Dakar', 570000);
INSERT INTO pays VALUES ('SYRIE', 'Damas', 580000);
INSERT INTO pays VALUES ('TIMOR ORIENTAL', 'Dili', 610000);
INSERT INTO pays VALUES ('DJIBOUTI', 'Djibouti', 620000);
INSERT INTO pays VALUES ('TANZANIE', 'Dodoma', 630000);
INSERT INTO pays VALUES ('QATAR', 'Doha', 640000);
INSERT INTO pays VALUES ('TADJIKISTAN', 'Douchanbé', 650000);
INSERT INTO pays VALUES ('IRLANDE', 'Dublin', 660000);
INSERT INTO pays VALUES ('ARMENIE', 'Erevan', 670000);
INSERT INTO pays VALUES ('SIERRA LEONE', 'Freetown', 680000);
INSERT INTO pays VALUES ('TUVALU', 'Funafuti', 690000);
INSERT INTO pays VALUES ('BOTSWANA', 'Gaborone', 700000);
INSERT INTO pays VALUES ('GUYANA', 'Georgetown', 710000);
INSERT INTO pays VALUES ('GUATEMALA', 'Guatemala', 720000);
INSERT INTO pays VALUES ('VIET NAM', 'Hanoï', 730000);
INSERT INTO pays VALUES ('ZIMBABWE', 'Harare', 740000);
INSERT INTO pays VALUES ('CUBA', 'La Havane', 750000);
INSERT INTO pays VALUES ('FINLANDE', 'Helsinki', 770000);
INSERT INTO pays VALUES ('SALOMON !SALOMON', 'Honiara', 780000);
INSERT INTO pays VALUES ('PAKISTAN', 'Islamabad', 790000);
INSERT INTO pays VALUES ('INDONESIE', 'Jakarta', 800000);
INSERT INTO pays VALUES ('AFGHANISTAN', 'Kaboul', 820000);
INSERT INTO pays VALUES ('OUGANDA', 'Kampala', 830000);
INSERT INTO pays VALUES ('NEPAL', 'Katmandou', 840000);
INSERT INTO pays VALUES ('SOUDAN', 'Khartoum', 850000);
INSERT INTO pays VALUES ('UKRAINE', 'Kiev', 860000);
INSERT INTO pays VALUES ('RWANDA', 'Kigali', 870000);
INSERT INTO pays VALUES ('JAMAIQUE', 'Kingston', 880000);
INSERT INTO pays VALUES ('SAINT-VINCENT-ET-LES GRENADINES', 'Kingstown', 890000);
INSERT INTO pays VALUES ('REPUBLIQUE DEMOCRATIQUE DU CONGO', 'Kinshasa', 900000);
INSERT INTO pays VALUES ('KOWEIT', 'Koweït', 920000);
INSERT INTO pays VALUES ('MALAISIE', 'Kuala Lumpur', 930000);
INSERT INTO pays VALUES ('GABON', 'Libreville', 940000);
INSERT INTO pays VALUES ('MALAWI', 'Lilongwe', 950000);
INSERT INTO pays VALUES ('PEROU', 'Lima', 960000);
INSERT INTO pays VALUES ('PORTUGAL', 'Lisbonne', 970000);
INSERT INTO pays VALUES ('SLOVENIE', 'Ljubljana', 980000);
INSERT INTO pays VALUES ('TOGO', 'Lomé', 990000);
INSERT INTO pays VALUES ('ROYAUME-UNI', 'Londres', 1000000);
INSERT INTO pays VALUES ('ANGOLA', 'Luanda', 1010000);
INSERT INTO pays VALUES ('ZAMBIE', 'Lusaka', 1020000);
INSERT INTO pays VALUES ('LUXEMBOURG', 'Luxembourg', 1030000);
INSERT INTO pays VALUES ('ESPAGNE', 'Madrid', 1040000);
INSERT INTO pays VALUES ('MARSHALL', 'Majuro', 1050000);
INSERT INTO pays VALUES ('GUINEE EQUATORIALE', 'Malabo', 1060000);
INSERT INTO pays VALUES ('MALDIVES', 'Malé', 1070000);
INSERT INTO pays VALUES ('NICARAGUA', 'Managua', 1080000);
INSERT INTO pays VALUES ('BAHREIN', 'Manama', 1090000);
INSERT INTO pays VALUES ('PHILIPPINES', 'Manille', 1100000);
INSERT INTO pays VALUES ('MOZAMBIQUE', 'Maputo', 1110000);
INSERT INTO pays VALUES ('OMAN', 'Mascate', 1120000);
INSERT INTO pays VALUES ('LESOTHO', 'Maseru', 1130000);
INSERT INTO pays VALUES ('SWAZILAND', 'Mbabane', 1140000);
INSERT INTO pays VALUES ('PALAOS', 'Melekeok', 1150000);
INSERT INTO pays VALUES ('MEXIQUE', 'Mexico', 1160000);
INSERT INTO pays VALUES ('BIELORUSSIE', 'Minsk', 1170000);
INSERT INTO pays VALUES ('SOMALIE', 'Mogadiscio', 1180000);
INSERT INTO pays VALUES ('MONACO', 'Monaco', 1190000);
INSERT INTO pays VALUES ('LIBERIA', 'Monrovia', 1200000);
INSERT INTO pays VALUES ('URUGUAY', 'Montevideo', 1210000);
INSERT INTO pays VALUES ('COMORES', 'Moroni', 1220000);
INSERT INTO pays VALUES ('RUSSIE', 'Moscou', 1230000);
INSERT INTO pays VALUES ('KENYA', 'Nairobi', 1250000);
INSERT INTO pays VALUES ('BAHAMAS', 'Nassau', 1260000);
INSERT INTO pays VALUES ('TCHAD', 'Ndjamena', 1270000);
INSERT INTO pays VALUES ('INDE', 'New Delhi', 1280000);
INSERT INTO pays VALUES ('NIGER', 'Niamey', 1290000);
INSERT INTO pays VALUES ('CHYPRE', 'Nicosie', 1300000);
INSERT INTO pays VALUES ('MAURITANIE', 'Nouakchott', 1310000);
INSERT INTO pays VALUES ('TONGA', 'Nukualofa', 1320000);
INSERT INTO pays VALUES ('NORVEGE', 'Oslo', 1330000);
INSERT INTO pays VALUES ('CANADA', 'Ottawa', 1340000);
INSERT INTO pays VALUES ('BURKINA FASO', 'Ouagadougou', 1350000);
INSERT INTO pays VALUES ('MONGOLIE', 'Oulan Bator', 1360000);
INSERT INTO pays VALUES ('MICRONESIE', 'Palikir', 1370000);
INSERT INTO pays VALUES ('PANAMA', 'Panama', 1380000);
INSERT INTO pays VALUES ('SURINAME', 'Paramaribo', 1390000);
INSERT INTO pays VALUES ('FRANCE', 'Paris', 1400000);
INSERT INTO pays VALUES ('BOLIVIE', 'La Paz', 1410000);
INSERT INTO pays VALUES ('CHINE', 'Pékin', 1420000);
INSERT INTO pays VALUES ('CAMBODGE', 'Phnom Penh', 1430000);
INSERT INTO pays VALUES ('MONTENEGRO', 'Podgorica', 1440000);
INSERT INTO pays VALUES ('MAURICE', 'Port-Louis', 1450000);
INSERT INTO pays VALUES ('PAPOUASIE-NOUVELLE-GUINEE', 'Port Moresby', 1460000);
INSERT INTO pays VALUES ('VANUATU', 'Port-Vila', 1470000);
INSERT INTO pays VALUES ('HAITI', 'Port-au-Prince', 1480000);
INSERT INTO pays VALUES ('TRINITE-ET-TOBAGO', 'Port of Spain', 1490000);
INSERT INTO pays VALUES ('REPUBLIQUE TCHEQUE', 'Prague', 1510000);
INSERT INTO pays VALUES ('CAP-VERT', 'Praia', 1520000);
INSERT INTO pays VALUES ('AFRIQUE DU SUD', 'Pretoria', 1530000);
INSERT INTO pays VALUES ('COREE DU NORD', 'Pyongyang', 1550000);
INSERT INTO pays VALUES ('EQUATEUR', 'Quito', 1560000);
INSERT INTO pays VALUES ('MAROC', 'Rabat', 1570000);
INSERT INTO pays VALUES ('BIRMANIE', 'Naypyiday', 1580000);
INSERT INTO pays VALUES ('ISLANDE', 'Reykjavik', 1590000);
INSERT INTO pays VALUES ('LETTONIE', 'Riga', 1600000);
INSERT INTO pays VALUES ('ARABIE SAOUDITE', 'Riyad', 1610000);
INSERT INTO pays VALUES ('ITALIE', 'Rome', 1620000);
INSERT INTO pays VALUES ('DOMINIQUE', 'Roseau', 1630000);
INSERT INTO pays VALUES ('REPUBLIQUE DOMINICAINE', 'Saint-Domingue', 1640000);
INSERT INTO pays VALUES ('GRENADE', 'Saint-Georges', 1650000);
INSERT INTO pays VALUES ('ANTIGUA-ET-BARBUDA', 'Saint Johns', 1660000);
INSERT INTO pays VALUES ('SAINT-MARIN', 'Saint-Marin', 1670000);
INSERT INTO pays VALUES ('COSTA RICA', 'San José', 1680000);
INSERT INTO pays VALUES ('SALVADOR', 'San Salvador', 1690000);
INSERT INTO pays VALUES ('YEMEN', 'Sanaa', 1700000);
INSERT INTO pays VALUES ('CHILI', 'Santiago', 1710000);
INSERT INTO pays VALUES ('SAO TOME-ET-PRINCIPE', 'Sao Tomé', 1720000);
INSERT INTO pays VALUES ('BOSNIE-HERZEGOVINE', 'Sarajevo', 1730000);
INSERT INTO pays VALUES ('COREE DU SUD', 'Séoul', 1740000);
INSERT INTO pays VALUES ('SINGAPOUR', 'Singapour', 1750000);
INSERT INTO pays VALUES ('MACEDOINE', 'Skopje', 1760000);
INSERT INTO pays VALUES ('BULGARIE', 'Sofia', 1770000);
INSERT INTO pays VALUES ('SUEDE', 'Stockholm', 1790000);
INSERT INTO pays VALUES ('FIDJI', 'Suva', 1810000);
INSERT INTO pays VALUES ('OUZBEKISTAN', 'Tachkent', 1820000);
INSERT INTO pays VALUES ('ESTONIE', 'Tallinn', 1830000);
INSERT INTO pays VALUES ('KIRIBATI', 'Tarawa', 1850000);
INSERT INTO pays VALUES ('GEORGIE', 'Tbilissi', 1860000);
INSERT INTO pays VALUES ('HONDURAS', 'Tegucigalpa', 1870000);
INSERT INTO pays VALUES ('IRAN', 'Téhéran', 1880000);
INSERT INTO pays VALUES ('ISRAEL', 'Tel-Aviv-Jaffa', 1890000);
INSERT INTO pays VALUES ('BHOUTAN', 'Thimphou', 1900000);
INSERT INTO pays VALUES ('ALBANIE', 'Tirana', 1910000);
INSERT INTO pays VALUES ('JAPON', 'Tokyo', 1920000);
INSERT INTO pays VALUES ('LIBYE', 'Tripoli', 1930000);
INSERT INTO pays VALUES ('TUNISIE', 'Tunis', 1940000);
INSERT INTO pays VALUES ('LIECHTENSTEIN', 'Vaduz', 1950000);
INSERT INTO pays VALUES ('MALTE', 'La Valette', 1970000);
INSERT INTO pays VALUES ('POLOGNE', 'Varsovie', 1980000);
INSERT INTO pays VALUES ('SEYCHELLES', 'Victoria', 1990000);
INSERT INTO pays VALUES ('AUTRICHE', 'Vienne', 2000000);
INSERT INTO pays VALUES ('LAOS', 'Vientiane', 2010000);
INSERT INTO pays VALUES ('LITUANIE', 'Vilnius', 2020000);
INSERT INTO pays VALUES ('ETATS-UNIS', 'Washington', 2030000);
INSERT INTO pays VALUES ('NOUVELLE-ZELANDE', 'Wellington', 2040000);
INSERT INTO pays VALUES ('NAMIBIE', 'Windhoek', 2050000);
INSERT INTO pays VALUES ('CAMEROUN', 'Yaoundé', 2080000);
INSERT INTO pays VALUES ('NAURU', 'Yaren', 2090000);
INSERT INTO pays VALUES ('CROATIE', 'Zagreb', 2100000);

# Application des autorisations
GRANT ALL PRIVILEGES ON *.* TO 'USERD314'@'localhost';
GRANT USAGE ON MESPAYS.pays TO 'USERD314'@'localhost';