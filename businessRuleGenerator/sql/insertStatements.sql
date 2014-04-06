--Application
INSERT INTO brg_application VALUES (1,'Customer sales app', 'CSA');

--operators
INSERT INTO brg_operator VALUES (1,'must be equal to');
INSERT INTO brg_operator VALUES (2,'may not be equal to');
INSERT INTO brg_operator VALUES (3,'must be smaller or equal to');
INSERT INTO brg_operator VALUES (4,'must be bigger or equal to');
INSERT INTO brg_operator VALUES (5,'must be bigger than');
INSERT INTO brg_operator VALUES (6,'must be smaller than');
INSERT INTO brg_operator VALUES (7,'must be between');
INSERT INTO brg_operator VALUES (8,'may not be between');
INSERT INTO brg_operator VALUES (9,'must be in');
INSERT INTO brg_operator VALUES (10,'may not be in');
INSERT INTO brg_operator VALUES (11,'must match');
INSERT INTO brg_operator VALUES (12,'may not match');

--backend rule types
INSERT INTO brg_back_end_rule_type VALUES (1, 'compare rule');
INSERT INTO brg_back_end_rule_type VALUES (2, 'list rule');
INSERT INTO brg_back_end_rule_type VALUES (3, 'regex rule');

--frontend rule types
INSERT INTO brg_front_end_rule_type VALUES (1, 'attribute compare rule', 'ACR');
INSERT INTO brg_front_end_rule_type VALUES (2, 'tuple compare rule', 'TCR');
INSERT INTO brg_front_end_rule_type VALUES (3, 'attribute range rule', 'ARR');

--allowed operators
INSERT INTO brg_allowed_operators VALUES (1,1);
INSERT INTO brg_allowed_operators VALUES (1,2);
INSERT INTO brg_allowed_operators VALUES (1,3);

INSERT INTO brg_allowed_operators VALUES (1,4);
INSERT INTO brg_allowed_operators VALUES (1,5);
INSERT INTO brg_allowed_operators VALUES (1,6);
INSERT INTO brg_allowed_operators VALUES (1,7);
INSERT INTO brg_allowed_operators VALUES (1,8);

INSERT INTO brg_allowed_operators VALUES (2,9);
INSERT INTO brg_allowed_operators VALUES (2,10);

INSERT INTO brg_allowed_operators VALUES (3,11);
INSERT INTO brg_allowed_operators VALUES (3,12);

--Value types
INSERT INTO brg_value_type VALUES (1,'static value');
INSERT INTO brg_value_type VALUES (2,'dynamic value');

--Language
INSERT INTO brg_language VALUES (1, 'PL/SQL');

--Application
INSERT INTO brg_application VALUES (1, 'Application name here', 'ANH');

