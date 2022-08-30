package kr.co.aske.rest_kotlin_blog_01.user.model

import lombok.AccessLevel
import lombok.Getter
import lombok.NoArgsConstructor
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
class User(
    @Id
    private val id: Long = 0,
    @Column
    private val name: String = "",
    @Column
    private val password: String = "",
) {}