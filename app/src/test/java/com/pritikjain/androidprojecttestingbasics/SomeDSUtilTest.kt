package com.pritikjain.androidprojecttestingbasics



import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SomeDSUtilTest {
    /**  Test 1. If n =0 : return 0
     *  Test 2 : if n =1 : return 1
     *  Test 3 : If n = -1 : return 1
     *  Test 4 : If n = 4 : return 3 return fib(n-2)+ fib (n-1)
     * */

    @Test
    fun `return 0 when n value is 0`(){
        val result = SomeDSUtil.fib(0)
        assertThat(result).isEqualTo(0);
    }

    @Test
    fun `return 1 when n value is 1`(){
        val result = SomeDSUtil.fib(1)
        assertThat(result).isEqualTo(1);
    }

    @Test
    fun `return 1 when n value is -1`(){
        val result = SomeDSUtil.fib(-1)
        assertThat(result).isEqualTo(1);
    }

    @Test
    fun `return fib(n-2) + fib(n-1) when n value is 4`(){
        val result = SomeDSUtil.fib(4)
        assertThat(result).isEqualTo(SomeDSUtil.fib(4-2)+SomeDSUtil.fib(4-1));
    }

    /**
     * check if the braces are set correctly
     * e.g. "(a * b))" should return false
     * Test 1: "(a * b))" : return false
     * Test 2 : "(a * b) : return true
     * Test 3 : "((a+b": return false
     * Test 4 : "1+2+3" return false
     */
    @Test
    fun `return false when given input has not exact count of opening and closing braces`(){
        val result = SomeDSUtil.checkBraces("(a * b))")
        assertThat(result).isFalse()
    }

    @Test
    fun `return true when given input has exact count of opening and closing braces`(){
        val result = SomeDSUtil.checkBraces("(a * b)")
        assertThat(result).isTrue()
    }

    @Test
    fun `return false when given input has not closing braces at all`(){
        val result = SomeDSUtil.checkBraces("((a+b")
        assertThat(result).isFalse()
    }

    @Test
    fun `return false when given input has no opening and closing braces at all`(){
        val result = SomeDSUtil.checkBraces("1+2+3")
        assertThat(result).isFalse()
    }
}