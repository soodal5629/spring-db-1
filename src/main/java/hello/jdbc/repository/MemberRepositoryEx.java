package hello.jdbc.repository;

import hello.jdbc.domain.Member;

import java.sql.SQLException;

public interface MemberRepositoryEx {

    // throws SQLException -> JDBC 특정 기술에 의존하는 인터페이스가 되어버림
    // 따라서 향후 JDBC가 아닌 다른 기술로 변경한다면 인터페이스도 변경해야 함
    // 의존주입이 전혀 의미 없게 되어버림

    Member save(Member member) throws SQLException;
    Member findById(String memberId) throws SQLException;
    void update(String memberId, int money) throws SQLException;
    void delete(String memberId) throws SQLException;
}
