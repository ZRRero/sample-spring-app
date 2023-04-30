CREATE TABLE IF NOT EXISTS authors (
    id uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    name varchar(100) NOT NULL,
    nationality varchar(20) NOT NULL,
    birth_date date NOT NULL,
    death_date date NULL
);

CREATE TABLE IF NOT EXISTS books(
    id uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    title varchar(100) NOT NULL,
    description text NOT NULL,
    cover_image_url varchar(255) NOT NULL,
    published_date date NOT NULL,
    author_id uuid NOT NULL,
    CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES authors(id)
);