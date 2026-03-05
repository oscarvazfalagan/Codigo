
-- q1
SELECT a.art_color ,a.art_pv
FROM artigos a 
GROUP BY a.art_color
HAVING a.art_pv > 100;
