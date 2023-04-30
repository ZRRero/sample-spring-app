INSERT INTO authors(id, name, nationality, birth_date, death_date)
    VALUES ('483f789d-5b2b-424b-ba34-597a35460dda', 'Isaac Asimov', 'American', '1919-01-02', '1992-04-06'),
           ('7e45d857-bbf4-4109-af46-1ab2626122f2','George Raymond Richard Martin', 'American', '1948-09-20', null);
INSERT INTO books(id, title, description, cover_image_url, published_date, author_id)
    VALUES ('a4e406dc-3d1a-42fc-bba1-eb3851e1efd5', 'Pebble in the Sky', '', '','1950-01-19', '483f789d-5b2b-424b-ba34-597a35460dda')