-- liquibase formatted sql

-- changeset tino:feature-1122-2
INSERT INTO role (roleId)
VALUES ("ADMIN");
INSERT INTO role (roleId)
VALUES ("EDITOR");
INSERT INTO role (roleId)
VALUES ("VIEWER");

-- changeset tino:feature-1234-2
INSERT INTO lang (langId, code, description)
VALUES (1, 'de', 'Deutsch');
INSERT INTO lang (langId, code, description)
VALUES (2, 'en', 'English');
INSERT INTO lang (langId, code, description)
VALUES (3, 'fr', 'FranÃ§ais');
INSERT INTO lang (langId, code, description)
VALUES (4, 'pt', 'PortuguÃªs');

INSERT INTO client (clientId)
VALUES (1);
INSERT INTO client (clientId)
VALUES (2);
INSERT INTO client (clientId)
VALUES (3);

INSERT INTO product (productId, clientId, price)
VALUES (1, 1, 10.20);
INSERT INTO product (productId, clientId, price)
VALUES (2, 1, 99.99);

INSERT INTO product_lang (productId, langId, name, description)
VALUES (1, 1, 'Isotherm-Tasche fÃ¼r Lebensmittel',
        'Halten Sie Ihr Picknick schÃ¶n kÃ¼hl oder warm! Schicke, isolierte Tasche fÃ¼r den BÃ¼ro-Lunch oder AusflÃ¼ge. Innen mit Aluminium-Folie. Oberes Abteil 25 x 16 x H 15 cm. Unteres Abteil 25 x 16 x H 7 cm. H total 24 cm. OberflÃ¤che wasserabperlend. Leicht glÃ¤nzendes Perl ...');
INSERT INTO product_lang (productId, langId, name, description)
VALUES (1, 3, 'Sac Ã  repas isotherme',
        'Gardez votre lunch bien chaud ou bien frais avec un sac isotherme chic pour le bureau ou les excursions ! DoublÃ© avec de la feuille d''aluminium. Compartiment du dessus 25 x 16 x H 15 cm. Compartiment du dessous 25 x 16 x H 7 cm. H totale 24 cm. RevÃªtement dÃ©perlant. Gris perle, lÃ©gÃ¨rement brillant.');
INSERT INTO product_lang (productId, langId, name, description)
VALUES (2, 1, 'Mira Eck Glas USB A',
        'Eck-Steckdosenelement, 2-fach und Doppel USB Charger (Ladestation). Frontseite in bedrucktem und kratzfestem Glas, fÃ¼r 90Â° Ecke.');
INSERT INTO product_lang (productId, langId, name, description)
VALUES (2, 2, 'Mira corner111 glass USB A',
        'Corner socket element, 2-fold and double USB charger (charging station). Front printed and scratch-resistant glass. for 90Â° corner.');