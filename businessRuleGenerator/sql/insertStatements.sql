--Application
INSERT INTO brg_application values (1,'Customer sales app', 'CSA');

--Operators
Insert Into Brg_Operator Values (1,'must be equal to');
Insert Into Brg_Operator Values (2,'may not be equal to');
Insert Into Brg_Operator Values (3,'must be smaller or equal to');
Insert Into Brg_Operator Values (4,'must be bigger or equal to');
Insert Into Brg_Operator Values (5,'must be bigger than');
Insert Into Brg_Operator Values (6,'must be smaller than');
Insert Into Brg_Operator Values (7,'must be between');
Insert Into Brg_Operator Values (8,'may not be between');
Insert Into Brg_Operator Values (9,'must be in');
Insert Into Brg_Operator Values (10,'may not be in');
Insert Into Brg_Operator Values (11,'must match');
Insert Into Brg_Operator Values (12,'may not match');

--backend rule types
Insert Into Brg_Back_End_Rule_Type Values (1, 'compare rule');
Insert Into Brg_Back_End_Rule_Type Values (2, 'list rule');
Insert Into Brg_Back_End_Rule_Type Values (3, 'regex rule');

--Allowed operators
Insert Into Brg_Allowed_Operators Values (1,1);
Insert Into Brg_Allowed_Operators Values (1,2);
Insert Into Brg_Allowed_Operators Values (1,3);

Insert Into Brg_Allowed_Operators Values (1,4);
Insert Into Brg_Allowed_Operators Values (1,5);
Insert Into Brg_Allowed_Operators Values (1,6);
Insert Into Brg_Allowed_Operators Values (1,7);
Insert Into Brg_Allowed_Operators Values (1,8);

Insert Into Brg_Allowed_Operators Values (2,9);
Insert Into Brg_Allowed_Operators Values (2,10);

Insert Into Brg_Allowed_Operators Values (3,11);
Insert Into Brg_Allowed_Operators Values (3,12);