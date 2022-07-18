INSERT INTO public.author (id, first_name, second_name, middle_name) VALUES (1, 'Kseniya', 'Gurova', 'Igorevna');
INSERT INTO public.author (id, first_name, second_name, middle_name) VALUES (2, 'Petr', 'Petrov', 'Petrovich');
INSERT INTO public.author (id, first_name, second_name, middle_name) VALUES (3, 'Ivan', 'Ivanov', 'Ivanovich');

INSERT INTO public.book (id, name, price) VALUES (7, 'book7', 3000);
INSERT INTO public.book (id, name, price) VALUES (2, 'book2', 1990);
INSERT INTO public.book (id, name, price) VALUES (5, 'book5', 990);
INSERT INTO public.book (id, name, price) VALUES (3, 'book3', 7000);
INSERT INTO public.book (id, name, price) VALUES (1, 'book1', 5000);
INSERT INTO public.book (id, name, price) VALUES (8, 'book8', 5000);
INSERT INTO public.book (id, name, price) VALUES (9, 'book9', 2000);
INSERT INTO public.book (id, name, price) VALUES (6, 'book6', 1800);
INSERT INTO public.book (id, name, price) VALUES (4, 'book4', 500);

INSERT INTO public.author_book_link (author_id, book_id) VALUES (1, 1);
INSERT INTO public.author_book_link (author_id, book_id) VALUES (1, 2);
INSERT INTO public.author_book_link (author_id, book_id) VALUES (1, 3);
INSERT INTO public.author_book_link (author_id, book_id) VALUES (1, 9);
INSERT INTO public.author_book_link (author_id, book_id) VALUES (2, 4);
INSERT INTO public.author_book_link (author_id, book_id) VALUES (2, 5);
INSERT INTO public.author_book_link (author_id, book_id) VALUES (2, 7);
INSERT INTO public.author_book_link (author_id, book_id) VALUES (3, 8);
INSERT INTO public.author_book_link (author_id, book_id) VALUES (3, 1);
INSERT INTO public.author_book_link (author_id, book_id) VALUES (3, 2);
