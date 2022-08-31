package kr.co.aske.rest_kotlin_blog_01.user.service

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class UserServiceTest {
    private val service: UserService = UserService()

    @Test
    fun login_it_should_success() {
        // given
        // when
        val got = service.funcLogin("admin","admin")

        // then
        assertEquals("token", got)
    }
}