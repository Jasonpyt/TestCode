#1����ѯ���еĿγ̵������Լ���Ӧ���ο���ʦ����
        select
            course.cname,
            teacher.tname
        from
            course
        inner join teacher on course.teacher_id = teacher.tid;

    #2����ѯѧ��������Ů�����ж�����
        select
            gender,
            count(1)   # count(sid)
        from
            student
        group by
            gender;

    #3����ѯ����ɼ�����100��ѧ��������
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
                        cname = '����'
                ) t2 on t1.course_id = t2.cid
                where
                    t1.num = 100
            );

    #4����ѯƽ���ɼ����ڰ�ʮ�ֵ�ͬѧ��������ƽ���ɼ�
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

    #5����ѯ����ѧ����ѧ�ţ�������ѡ�������ܳɼ�(ע�⣺������Щû��ѡ���κογ̵�ѧ��Ҳ������)
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

    #6�� ��ѯ������ʦ�ĸ���
        select
            count(tid)
        from
            teacher
        where
            tname like '��%';

    #7�� ��ѯû�б���ƽ��ʦ�ε�ѧ������
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
                        where teacher.tname = '��ƽ��ʦ'
                    )
            );

    #8�� ��ѯ����γ̱�����γ̸ߵ�ѧ����ѧ��(�ֱ�õ�����ɼ���������ɼ���Ȼ��������)
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
                            cname = '����'
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
                        cname = '����'
                )
        ) as t2 on t1.student_id = t2.student_id
        where
            t1.num > t2.num;

    #9�� ��ѯû��ͬʱѡ������γ̺������γ̵�ѧ������
    # ����������������ûѡ��
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
                                    '����',
                                    '����'
                                )
                        )
                ) as t1
            group by
                t1.student_id
            having
                count(t1.student_id) = 2
        );
        # ֻѡ����һ��
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
                                        '����',
                                        '����'
                                    )
                            )
                    ) as t1
                group by
                    t1.student_id
                having
                    count(t1.student_id) = 1
            );
            # ��һ�ַ�����
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
                                cname = '����'
                            OR cname = '����'
                        )
                    GROUP BY
                        student_id
                    HAVING
                        COUNT(course_id) = 1
                );

    #10����ѯ�ҿƳ�������(��������)��ѧ�������Ͱ༶
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
        #��һ�ַ�����
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

    #11����ѯѡ�������пγ̵�ѧ������
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

    #12����ѯ��ƽ��ʦ�̵Ŀγ̵����гɼ���¼
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
                    teacher.tname = '��ƽ��ʦ'
            );

    #13����ѯȫ��ѧ����ѡ���˵Ŀγ̺źͿγ���(ȡ����ѧ������Ȼ�����score��Ŀγ̷��飬�ҳ�count(student_id)����ѧ��������)
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

    #14����ѯÿ�ſγ̱�ѡ�޵Ĵ���
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

    #15����ѯ֮ѡ����һ�ſγ̵�ѧ��������ѧ��
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

    #16����ѯ����ѧ�������ĳɼ������Ӹߵ������򣨳ɼ�ȥ�أ�
        select distinct
            num
        from
            score
        order by
            num desc;

    #17����ѯƽ���ɼ�����85��ѧ��������ƽ���ɼ�
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

    #18����ѯ����ɼ��������ѧ�������Ͷ�Ӧ�������
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
            where course.cname = '����'
                and score.num < 60
        ) as t1 on student.sid = t1.student_id;
        # ��һ�ַ�����
        select
            student.sname,
            score.num
        from
            score
        left join course on score.course_id = course.cid
        left join student on score.student_id = student.sid
        where
            course.cname = '����'
            and score.num < 60;

    #19����ѯ������ѡ������ƽ��ʦ�γ̵�ѧ���У���Щ�γ�(��ƽ��ʦ�Ŀγ̣��������пγ�)ƽ���ɼ���ߵ�ѧ������
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
                    where teacher.tname = '��ƽ��ʦ'
                )
            group by
                student_id
            order by
                avg_num desc
            limit 1
        ) as t1 on student.sid = t1.student_id;

    #20����ѯÿ�ſγ̳ɼ���õ�ǰ����ѧ������
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

    #21����ѯ��ͬ�γ̵��ɼ���ͬ��ѧ�ţ��γ̺ţ��ɼ�
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

    #22����ѯûѧ����ƽ��ʦ�γ̵�ѧ�������Լ�ѡ�޵Ŀγ����ƣ�
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
                        where teacher.tname = '��ƽ��ʦ'
                    )
            ) as t1
        inner join course on t1.course_id = course.cid
        inner join student on t1.student_id = student.sid
        order by student.sname;

    #23����ѯ����ѡ����ѧ��Ϊ1��ͬѧѡ�޹���һ�Ż��߶��ſγ̵�ͬѧѧ�ź�������
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
        # ��һ�ַ�����
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

    #24���ο�������ʦ��ѧ�����Ƴɼ���ߵ�ѧ������
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