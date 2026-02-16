# Write your MySQL query statement below




select id as id,count(*) as num from
(
select requester_id as id from RequestAccepted union all 
select accepter_id id from RequestAccepted
) as allData
group by id
order by num desc
LIMIT 1;
