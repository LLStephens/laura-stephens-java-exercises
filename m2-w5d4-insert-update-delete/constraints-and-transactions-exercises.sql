-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
insert into actor (first_name, last_name) values ('HAMPTON', 'AVENUE');
insert into actor (first_name, last_name) values ('LISA', 'BYWAY');

select * from actor
where first_name = 'LISA' and last_name = 'BYWAY'

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
insert into film (title, description, release_year, language_id, length) values ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in 
ancient Greece', 2008, 1, 198)

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
select film_id, title from film where title = 'Euclidean PI' 1002
select actor_id, last_name from actor where last_name = 'BYWAY' 202
select actor_id, last_name from actor where last_name = 'AVENUE' 201

insert into film_actor (actor_id, film_id) values (202, 1002)
insert into film_actor (actor_id, film_id) values (201, 1002)

-- 4. Add Mathmagical to the category table.
insert into category (name) values ('Mathmagical')

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
insert into film_category(film_id, category_id) values ((select film_id from film where title = 'Euclidean PI'), (select category_id from category where name = 'Mathmagical'))
insert into film_category(film_id, category_id) values ((select film_id from film where title = 'EGG IGBY'), (select category_id from category where name = 'Mathmagical'))
insert into film_category(film_id, category_id) values ((select film_id from film where title = 'KARATE MOON'), (select category_id from category where name = 'Mathmagical'))
insert into film_category(film_id, category_id) values ((select film_id from film where title = 'RANDOM GO'), (select category_id from category where name = 'Mathmagical'))
insert into film_category(film_id, category_id) values ((select film_id from film where title = 'YOUNG LANGUAGE'), (select category_id from category where name = 'Mathmagical'))

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
update film
set rating = 'G'
from film_category
where film.film_id = film_category.film_id
and category_id = 17

-- 7. Add a copy of "Euclidean PI" to all the stores.
insert into inventory (film_id, store_id) values (1002, 1)
insert into inventory (film_id, store_id) values (1002, 2)


-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
"film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor"
delete from film 
where title = 'Euclidean PI'

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
delete from category
where name = 'Mathmagical'
violates foreign key constraint "film_category_category_id_fkey" on table "film_category"

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
delete from film_category
where category_id = 17
deleted the linked fields

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
delete from category
where name = 'Mathmagical'
mathamagical is no longer linked to any film_ids
delete from film 
where title = 'Euclidean PI'
violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor"

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.
film_actor and inventory links
