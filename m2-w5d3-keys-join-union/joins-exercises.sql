-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
--    Rows: 30
select f.title from film f
join film_actor fa on f.film_id = fa.film_id
join actor a on a.actor_id = fa.actor_id
where a.first_name = 'NICK'
and a.last_name = 'STALLONE'

-- 2. All of the films that Rita Reynolds has appeared in
--    Rows: 20
select f.title from film f
join film_actor fa on f.film_id = fa.film_id
join actor a on a.actor_id = fa.actor_id
where a.first_name = 'RITA'
and a.last_name = 'REYNOLDS'

-- 3. All of the films that Judy Dean or River Dean have appeared in
--    Rows: 46
select f.title from film f
join film_actor fa on f.film_id = fa.film_id
join actor a on a.actor_id = fa.actor_id
where a.first_name = 'JUDY' or a.first_name = 'RIVER'
and a.last_name = 'DEAN'

-- 4. All of the the ‘Documentary’ films
--    Rows: 68

select f.title from film f
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
where c.name = 'Documentary'

-- 5. All of the ‘Comedy’ films
--    Rows: 58
select f.title from film f
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
where c.name = 'Comedy'

-- 6. All of the ‘Children’ films that are rated ‘G’
--    Rows: 10 
select f.title from film f
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
where c.name = 'Children'
and f.rating = 'G'

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
--    Rows: 3
select f.title from film f
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
where c.name = 'Family'
and f.rating = 'G'
and f.length < 120

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
--    Rows: 9
select f.title from film f
join film_actor fa on f.film_id = fa.film_id
join actor a on a.actor_id = fa.actor_id
where a.first_name = 'MATTHEW'
and a.last_name = 'LEIGH'
and f.rating = 'G'


-- 9. All of the ‘Sci-Fi’ films released in 2006
--    Rows: 61
select f.title from film f
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
where c.name = 'Sci-Fi'
and release_year = 2006

-- 10. All of the ‘Action’ films starring Nick Stallone
--     Rows: 2
select f.title from film f
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
join film_actor fa on f.film_id = fa.film_id
join actor a on a.actor_id = fa.actor_id
where c.name = 'Action'
and a.first_name = 'NICK'
and a.last_name = 'STALLONE'


-- 11. The address of all stores, including street address, city, district, and country
--     Rows: 2
select a.address, c.city, a.district, t.country from address a
join store s on s.address_id = a.address_id
join city c on c.city_id = a.city_id
join country t on c.country_id = t.country_id

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
--     Rows: 2
select s.store_id, a.address, f.first_name, f.last_name from address a
join store s on s.address_id = a.address_id
join staff f on s.store_id = f.store_id

-- 13. The first and last name of the top ten customers ranked by number of rentals 
--     Hint: #1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals
select c.first_name, c.last_name, count(r.rental_id) from customer c
join rental r on c.customer_id = r.customer_id
group by c.first_name, c.last_name
order by count(r.rental_id) desc
limit 10

-- 14. The first and last name of the top ten customers ranked by dollars spent 
--     Hint: #1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent
select c.first_name, c.last_name, sum(p.amount) from payment p
join customer c on c.customer_id = p.customer_id
group by c.first_name, c.last_name
order by sum(p.amount) desc
limit 10

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
--     Hint: Store 1 has 7928 total rentals and Store 2 has 8121 total rentals
select s.store_id, a.address, count(r.rental_id), sum(p.payment_id), avg(p.amount) from store s
join inventory i on s.store_id = i.store_id
join rental r on r.inventory_id = i.inventory_id
join payment p on p.rental_id = r.rental_id
join address a on a.address_id = s.address_id
group by s.store_id, a.address

-- 16. The top ten film titles by number of rentals 
--     Hint: #1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals
select f.title, count(r.rental_id) from film f
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
group by f.title
order by count(r.rental_id) desc
limit 10

-- 17. The top five film categories by number of rentals 
--     Hint: #1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals
select c.name, count(r.rental_id) from category c
join film_category fc on fc.category_id = c.category_id
join film f on f.film_id = fc.film_id
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
group by c.name
order by count(r.rental_id) desc
limit 5

-- 18. The top five Action film titles by number of rentals 
--     Hint: #1 should have 30 rentals and #5 should have 28 rentals
select f.title, count(r.rental_id) from category c
join film_category fc on fc.category_id = c.category_id
join film f on f.film_id = fc.film_id
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
where c.name = 'Action'
group by f.title
order by count(r.rental_id) desc
limit 5

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
--     Hint: #1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals
select a.first_name, a.last_name, count(r.rental_id) as rentals from actor a
join film_actor fa on a.actor_id = fa.actor_id
join film f on fa.film_id = f.film_id
join inventory i on f.film_id = i.film_id
join rental r on i.inventory_id = r.inventory_id
group by a.first_name, a.last_name, a.actor_id
order by count(r.rental_id) desc
limit 10

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
--     Hint: #1 should have 87 rentals and #5 should have 72 rentals
select a.first_name, a.last_name, count(r.rental_id) as rentals from actor a
join film_actor fa on a.actor_id = fa.actor_id
join film f on fa.film_id = f.film_id
join inventory i on f.film_id = i.film_id
join rental r on i.inventory_id = r.inventory_id
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
where c.name = 'Comedy'
group by a.first_name, a.last_name, a.actor_id
order by count(r.rental_id) desc
limit 5