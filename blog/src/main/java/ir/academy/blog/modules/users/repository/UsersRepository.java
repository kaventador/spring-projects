package ir.academy.blog.modules.users.repository;

import ir.academy.blog.modules.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository<Users,Long> {

    @Query("select u from Users u where u.email = :email")
    Users userByEmail(@Param("email") String email);

}
