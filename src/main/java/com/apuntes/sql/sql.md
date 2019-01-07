Actualizar

```UPDATE table1 SET col1 = 1 WHERE col2 = 2```

Insertar

```INSERT INTO table1 (id, first_name, last_name) VALUES (1, 'Rebel', 'Labs');```

INSERT INTO table1 (id, first_name, last_name)
  SELECT id, last_name, first_name FROM table2

Borrar

```DELETE FROM tWHERE condition```


Join
SELECT … from TABLE table1 JOIN table2 ON table1.id = table2.t1_id


There are several types of JOINs, but here are three most frequently used.

```INNER JOIN – fetch the results that exist in both tables```

```LEFT OUTER – fetch all rows from the table A, even if they do not exist in table B so that the result set will have half-populated wors.```

```RIGHT OUTER – the opposite: fetch all rows from table B, even when the corresponding data in table A are absent.```

Subquery

```SELECT col1, col2 FROM table1 WHERE id IN (SELECT t1_id FROM table2 WHERE date > CURRENT_TIMESTAMP)```

Crear tabla

```CREATE TABLE table_name (
    column1 datatype,
    column2 datatype,
    column3 datatype,
   ....
);```