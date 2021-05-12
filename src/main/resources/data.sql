-- Professors
-- Password for all Ussers: password
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'lukovic@mail.com', 'ivan.lukovic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Ivan', 'Luković', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'perisic@mail.com', 'branko.perisic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Branko', 'Perišić', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'kovacevic@mail.com', 'aleksandar.kovacevic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Aleksandar', 'Kovačević', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'suvajdzin.rakic@mail.com','zorica.suvajdzin','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Zorica', 'Suvajdžin Rakić', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'vidakovic@mail.com','milan.vidakovic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Milan', 'Vidaković', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'ivetic@mail.com','dragan.ivetic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Dragan', 'Ivetić', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'milosavljevic@mail.com','branko.milosavljevic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Branko', 'Milosavljević', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'sladic@mail.com','goran.sladic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Goran', 'Sladić', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'slivka@mail.com','jelena.slivka','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Jelena', 'Slivka', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'zaric@mail.com','miroslav.zaric','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Miroslav', 'Zarić', 'Bio',null, null);
INSERT INTO users
    (role, email, username, password, first_name, last_name, bio, allow_to_apply, status) VALUES
    ('PROFESSOR', 'milosavljevicg@mail.com','gordana.milosavljevic','$2y$10$zgqjTKeV9ZdfkPHjPwJNGutegVSopA1dPIhGJeNgG9srnyQVEDkj.', 'dr Gordana', 'Milosavljević', 'Bio',null, null);
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
INSERT INTO user_authority (user_id, authority_id) VALUES (5, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (6, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (7, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (8, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (9, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (10, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (11, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (12, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (13, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (14, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (15, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (16, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (17, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (18, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (19, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (20, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (21, 2);

-- Subjects
INSERT INTO subject (title, professor_id) VALUES ('Baze podataka 1', 1);
INSERT INTO subject (title, professor_id) VALUES ('Numerički algoritmi i numerički softver', 3);
INSERT INTO subject (title, professor_id) VALUES ('Programski prevodioci', 4);
INSERT INTO subject (title, professor_id) VALUES ('Osnovi računarske inteligencije', 3);
INSERT INTO subject (title, professor_id) VALUES ('Interakcija čovek računar', 6);
INSERT INTO subject (title, professor_id) VALUES ('Internet mreže', 7);
INSERT INTO subject (title, professor_id) VALUES ('Specifikacija i modeliranje softvera', 2);
INSERT INTO subject (title, professor_id) VALUES ('Veb programiranje', 5);
INSERT INTO subject (title, professor_id) VALUES ('Projektovanje softvera', 8);
INSERT INTO subject (title, professor_id) VALUES ('Soft kompjuting', 9);
INSERT INTO subject (title, professor_id) VALUES ('Računarska grafika', 6);
INSERT INTO subject (title, professor_id) VALUES ('Baze podataka 2', 1);
INSERT INTO subject (title, professor_id) VALUES ('Internet softverske arhitekture', 7);
INSERT INTO subject (title, professor_id) VALUES ('XML i veb servisi', 10);
INSERT INTO subject (title, professor_id) VALUES ('Poslovna informatika', 11);
