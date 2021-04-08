-- Professors
-- Password for all Ussers: password
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'petarpetrovic@mail.com', 'petar.petrovic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Petar', 'Petrovic', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'milanmilanovic@mail.com', 'milan.milanovic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Milan', 'Milanovic', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'jovanjovanovic@mail.com', 'jovan.jovanovic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Jovan', 'Jovanovic', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'stefanstefanovic@mail.com','stefan.stefanovic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Stefan', 'Stefanovic', 'Bio',null, null);

-- Students
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('STUDENT', 'stefansumar@mail.com', 'stefan.sumar', '$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Stefan', 'Sumar', 'Bio', true, 'BACHELOR');
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('STUDENT', 'milospoletanovic@mail.com', 'milos.poletanovic', '$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Milos', 'Poletanovic', 'Bio', true, 'BACHELOR');
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('STUDENT', 'irinikoziou@mail.com', 'irini.koziou', '$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Irini', 'Koziou', 'Bio', true, 'BACHELOR');
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('STUDENT', 'borislavgajic@mail.com', 'borislav.gajic', '$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Borislav', 'Gajic', 'Bio', true, 'BACHELOR');
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('STUDENT', 'urosvukovic@mail.com', 'uros.vukovic', '$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Uros', 'Vukovic', 'Bio', true, 'BACHELOR');
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('STUDENT', 'jelenagaric@mail.com', 'jelena.garic', '$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Jelena', 'Garic', 'Bio', true, 'BACHELOR');
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('STUDENT', 'anatomic@mail.com', 'ana.tomic', '$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Ana', 'Tomic', 'Bio', true, 'BACHELOR');
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('STUDENT', 'nikolakekic@mail.com', 'nikola.kekic', '$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Nikola', 'Kekic', 'Bio', true, 'BACHELOR');
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('STUDENT', 'jelenastojakovic@mail.com', 'jelena.stojakovic', '$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Jelena', 'Stojakovic', 'Bio', true, 'BACHELOR');
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('STUDENT', 'igormalesevic@mail.com', 'igor.malesevic', '$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'Igor', 'Malesevic', 'Bio', true, 'BACHELOR');

-- Authorities
INSERT INTO authority (name) VALUES ('ROLE_PROFESSOR');
INSERT INTO authority (name) VALUES ('ROLE_STUDENT');

-- User authorities
INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (2, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (3, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (4, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (5, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (6, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (7, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (8, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (9, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (10, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (11, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (12, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (13, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (14, 2);

-- Subjects
INSERT INTO subject (title, professor_id) VALUES ('Racunarska grafika', 1);
INSERT INTO subject (title, professor_id) VALUES ('Interakcija covek racunar', 1);
INSERT INTO subject (title, professor_id) VALUES ('Osnove racunarske inteligencije', 1);
INSERT INTO subject (title, professor_id) VALUES ('Soft kompjuting', 1);
INSERT INTO subject (title, professor_id) VALUES ('Baze podataka 1', 2);
INSERT INTO subject (title, professor_id) VALUES ('Baze podataka 2', 2);
INSERT INTO subject (title, professor_id) VALUES ('Internet softverske arhitekture', 2);
INSERT INTO subject (title, professor_id) VALUES ('XML i Web servisi', 2);
INSERT INTO subject (title, professor_id) VALUES ('Poslovna informatika', 3);
INSERT INTO subject (title, professor_id) VALUES ('Bezbednost u sistemima elektronskog poslovanja', 3);
INSERT INTO subject (title, professor_id) VALUES ('Web programiranje', 3);
INSERT INTO subject (title, professor_id) VALUES ('Programski prevodioci', 3);
INSERT INTO subject (title, professor_id) VALUES ('Internet mreze', 4);
INSERT INTO subject (title, professor_id) VALUES ('Metode optimizacije', 4);
INSERT INTO subject (title, professor_id) VALUES ('Osnove informacionih sistema i softverskog inzenjerstva', 4);
INSERT INTO subject (title, professor_id) VALUES ('Specifikacija i modelovanje softvera', 4);