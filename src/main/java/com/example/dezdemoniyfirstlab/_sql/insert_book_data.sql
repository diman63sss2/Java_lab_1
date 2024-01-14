CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
INSERT INTO book (uuid, content, is_deleted, creation_date, last_modified_date, author_id)
VALUES (UUID_generate_v4(), 'Sample book content1', FALSE, '2022-01-01 12:00:00', '2022-01-01 12:00:00', 1);
INSERT INTO book (uuid, content, is_deleted, creation_date, last_modified_date, author_id)
VALUES (UUID_generate_v4(), 'Sample book content1', FALSE, '2022-01-01 12:00:00', '2022-01-01 12:00:00', 1);
INSERT INTO book (uuid, content, is_deleted, creation_date, last_modified_date, author_id)
VALUES (UUID_generate_v4(), 'Sample book content2', FALSE, '2022-01-01 12:00:00', '2022-01-01 12:00:00', 2);