INSERT INTO POSTS(USER_ID, BODY)
VALUES (2, 'Tresc posta');

UPDATE POSTS
SET BODY = 'To delete'
WHERE ID = 7;

DELETE FROM POSTS
WHERE ID = 7;
COMMIT;
SELECT * FROM POSTS;