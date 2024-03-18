BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS monsterCard(
    id INTEGER PRIMARY KEY,
    name TEXT,
    rank INTEGER,
    effect TEXT,
    attackForce INTEGER,
    defendForce INTEGER
    );
INSERT INTO monsterCard(name,rank,effect,attackForce,defendForce)
    VALUES
    ('E-Hero Neos',8,'Came from far universe,here to save you.',2500,3000);
COMMIT;
