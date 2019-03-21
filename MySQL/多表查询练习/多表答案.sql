#1、查询所有的课程的名称以及对应的任课老师姓名
        select
            course.cname,
            teacher.tname
        from
            course
        inner join teacher on course.teacher_id = teacher.tid;

    #2、查询学生表中男女生各有多少人
        select
            gender,
            count(1)   # count(sid)
        from
            student
        group by
            gender;

    #3、查询物理成绩等于100的学生的姓名
        select
            sname
        from
            student
        where
            sid in(
                select
                    t1.student_id
                from
                    score t1
                inner join(
                    select
                        cid
                    from
                        course
                    where
                        cname = '物理'
                ) t2 on t1.course_id = t2.cid
                where
                    t1.num = 100
            );

    #4、查询平均成绩大于八十分的同学的姓名和平均成绩
        select
            t1.sname,
            t2.avg_num
        from
            student as t1
        inner join(
            select
                student_id,
                avg(num) as avg_num
            from
                score
            group by
                student_id
            having
                avg(num) > 80
        ) as t2 on t1.sid = t2.student_id;

    #5、查询所有学生的学号，姓名，选课数，总成绩(注意：对于那些没有选修任何课程的学生也算在内)
        select
            t1.sid,
            t1.sname,
            t2.count_course,
            t2.sum_num
        from
            student as t1
        left join(
            select
                student_id,
                count(course_id) as count_course,
                sum(num) as sum_num
            from
                score
            group by
                student_id
        ) as t2 on t1.sid = t2.student_id;

    #6、 查询姓李老师的个数
        select
            count(tid)
        from
            teacher
        where
            tname like '李%';

    #7、 查询没有报李平老师课的学生姓名
        select
            sname
        from
            student
        where
            sid not in(
                select distinct
                    student_id
                from
                    score
                where
                    course_id in (
                        select
                            cid
                        from
                            course
                        inner join teacher on course.teacher_id = teacher.tid
                        where teacher.tname = '李平老师'
                    )
            );

    #8、 查询物理课程比生物课程高的学生的学号(分别得到物理成绩表与生物成绩表，然后连表即可)
        select
            t1.student_id,
            t1.num,
            t2.num
        from
            (
                select
                    student_id,
                    num
                from
                    score
                where
                    course_id = (
                        select
                            cid
                        from
                            course
                        where
                            cname = '物理'
                    )
            ) as t1
        inner join (
            select
                student_id,
                num
            from
                score
            where
                course_id = (
                    select
                        cid
                    from
                        course
                    where
                        cname = '生物'
                )
        ) as t2 on t1.student_id = t2.student_id
        where
            t1.num > t2.num;

    #9、 查询没有同时选修物理课程和体育课程的学生姓名
    # 包含了物理，体育都没选得
    select
        sname
    from
        student
    where
        sid not in (
            select
                t1.student_id
            from
                (
                    select
                        student_id,
                        course_id
                    from
                        score
                    where
                        course_id in (
                            select
                                cid
                            from
                                course
                            where
                                cname in (
                                    '物理',
                                    '体育'
                                )
                        )
                ) as t1
            group by
                t1.student_id
            having
                count(t1.student_id) = 2
        );
        # 只选修了一门
        select
            sname
        from
            student
        where
            sid in (
                select
                    t1.student_id
                from
                    (
                        select
                            student_id,
                            course_id
                        from
                            score
                        where
                            course_id in (
                                select
                                    cid
                                from
                                    course
                                where
                                    cname in (
                                        '物理',
                                        '体育'
                                    )
                            )
                    ) as t1
                group by
                    t1.student_id
                having
                    count(t1.student_id) = 1
            );
            # 另一种方法：
            SELECT
                student.sname
            FROM
                student
            WHERE
                sid IN (
                    SELECT
                        student_id
                    FROM
                        score
                    WHERE
                        course_id IN (
                            SELECT
                                cid
                            FROM
                                course
                            WHERE
                                cname = '物理'
                            OR cname = '体育'
                        )
                    GROUP BY
                        student_id
                    HAVING
                        COUNT(course_id) = 1
                );

    #10、查询挂科超过两门(包括两门)的学生姓名和班级
        select
            t1.caption,
            t2.sname
        from
            class as t1
        inner join (
            select
                sname,
                class_id
            from
                student
            where
                sid in (
                    select
                        student_id
                    from
                        score
                    where
                        num < 60
                    group by
                        student_id
                    having
                        count(sid) >= 2
                )
        ) as t2 on t1.cid = t2.class_id;
        #另一种方法：
        SELECT
            student.sname,
            class.caption
        FROM
            student
        INNER JOIN (
            SELECT
                student_id
            FROM
                score
            WHERE
                num < 60
            GROUP BY
                student_id
            HAVING
                count(course_id) >= 2
        ) AS t1
        INNER JOIN class ON student.sid = t1.student_id
        AND student.class_id = class.cid;

    #11、查询选修了所有课程的学生姓名
        select
            sname
        from
            student
        where
            sid in (
                select
                    student_id
                from
                    score
                group by
                    student_id
                having
                    count(sid) = (
                        select
                            count(cid)
                        from
                            course
                    )
            );

    #12、查询李平老师教的课程的所有成绩记录
        select
            *
        from
            score
        where
            course_id in (
                select
                    cid
                from
                    course
                inner join teacher on course.teacher_id = teacher.tid
                where
                    teacher.tname = '李平老师'
            );

    #13、查询全部学生都选修了的课程号和课程名(取所有学生数，然后基于score表的课程分组，找出count(student_id)等于学生数即可)
        select
            cid,
            cname
        from
            course
        where
            cid in (
                select
                    course_id
                from
                    score
                group by
                    course_id
                having
                    count(sid) = (select count(sid) from student)
            );

    #14、查询每门课程被选修的次数
        select
            course_id,
            count(sid)
        from
            score
        right join course on score.course_id = course.cid
        group by
            course_id
        order by
            course_id;

        SELECT
            course_id,
            COUNT(student_id)
        FROM
            score
        GROUP BY
            course_id;

    #15、查询之选修了一门课程的学生姓名和学号
        select
            sid,
            sname
        from
            student
        where
            sid in (
                select
                    student_id
                from
                    score
                group by
                    student_id
                having
                    count(sid) = 1
            );

    #16、查询所有学生考出的成绩并按从高到低排序（成绩去重）
        select distinct
            num
        from
            score
        order by
            num desc;

    #17、查询平均成绩大于85的学生姓名和平均成绩
        select
            student.sname,
            t1.avg_num
        from
            student
        inner join (
            select
                student_id,
                avg(num) as avg_num
            from
                score
            group by
                student_id
            having
                avg(num) > 85
        ) as t1 on student.sid = t1.student_id;

    #18、查询生物成绩不及格的学生姓名和对应生物分数
        select
            sname,
            t1.num
        from
            student
        inner join (
            select
                student_id,
                num
            from
                score
            inner join course on score.course_id = course.cid
            where course.cname = '生物'
                and score.num < 60
        ) as t1 on student.sid = t1.student_id;
        # 另一种方法：
        select
            student.sname,
            score.num
        from
            score
        left join course on score.course_id = course.cid
        left join student on score.student_id = student.sid
        where
            course.cname = '生物'
            and score.num < 60;

    #19、查询在所有选修了李平老师课程的学生中，这些课程(李平老师的课程，不是所有课程)平均成绩最高的学生姓名
        select
            sname,
            t1.avg_num
        from
            student
        inner join (
            select
                student_id,
                avg(num) as avg_num
            from
                score
            where
                course_id in (
                    select
                        cid
                    from
                        course
                    inner join teacher on course.teacher_id = teacher.tid
                    where teacher.tname = '李平老师'
                )
            group by
                student_id
            order by
                avg_num desc
            limit 1
        ) as t1 on student.sid = t1.student_id;

    #20、查询每门课程成绩最好的前两名学生姓名
        select
            student.sname,
            num_table.course_id,
            num_table.first_num,
            num_table.second_num
        from
            student
        inner join (
            select
                score.sid,
                score.course_id as course_id,
                score.student_id,
                t.first_num as first_num,
                t.second_num as second_num
            from
                score
            left join
                (
                    select
                        sid,
                        (select num from score as s2 where s2.course_id = s1.course_id order by num desc limit 0,1) as first_num,
                        (select num from score as s3 where s3.course_id = s1.course_id order by num desc limit 1,1) as second_num
                    from
                        score as s1
                ) as t on score.sid = t.sid
            where score.num <= t.first_num and score.num >= t.second_num
        ) as num_table on student.sid = num_table.student_id;

    #21、查询不同课程但成绩相同的学号，课程号，成绩
        select distinct
            s1.student_id,
            s1.course_id,
            s1.num,
            s2.num
        from
            score as s1,
            score as s2
        where
            s1.num = s2.num
            and s1.course_id != s2.course_id;

        select distinct
            *
        from
            score as s1,
            score as s2
        where
            s1.num = s2.num

    #22、查询没学过李平老师课程的学生姓名以及选修的课程名称；
        select
            student.sname,
            course.cname
        from
            (
                select
                    student_id,
                    course_id
                from
                    score
                where
                    course_id not in (
                        select
                            cid
                        from
                            course
                        inner join teacher on course.teacher_id = teacher.tid
                        where teacher.tname = '李平老师'
                    )
            ) as t1
        inner join course on t1.course_id = course.cid
        inner join student on t1.student_id = student.sid
        order by student.sname;

    #23、查询所有选修了学号为1的同学选修过的一门或者多门课程的同学学号和姓名；
         select
            student_id,
            sname,
            count(course_id)
        from
            score
        left join student on score.student_id = student.sid
        where
            student_id != 1
            and course_id in
                (
                    select
                        course_id
                    from
                        score
                    where
                        student_id = 1
                )
        group by student_id
        # 另一种方法：
        select
            sid,
            sname
        from
            student
        where
            sid in (
                select
                    student_id
                from
                    score
                where
                    course_id in (
                        select
                            course_id
                        from
                            score
                        where
                            student_id = 1
                    )
            )
            and sid !=1

    #24、任课最多的老师中学生单科成绩最高的学生姓名
        select
            sid,
            sname
        from
            student
        where
            sid in (
                select distinct
                    t1.id_students
                from
                    (
                        select
                            group_concat(student_id) as id_students,
                            course_id,
                            max(num)
                        from
                            score
                        where
                            course_id in (
                                select
                                    cid
                                from
                                    course
                                where
                                    teacher_id in (
                                        select
                                            teacher_id
                                        from
                                            course
                                        group by
                                            teacher_id
                                        having
                                            count(cid) = (
                                                select
                                                    count(cid)
                                                from
                                                    course
                                                group by
                                                    teacher_id
                                                order by
                                                    count(cid) desc
                                                limit 1
                                            )
                                    )
                            )
                        group by
                            course_id
                    ) as t1
            );