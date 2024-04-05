package com.pritikjain.androidprojecttestingbasics

object SomeDSUtil {
    /**
     *  Returns the n-th fibonacci number
     *  They are f=defined like this:
     *  fib(0) = 0;
     *  fib(1) = 1;
     *  fib(n) = fib(n-2) + fib(n-1)
     *  Test 1. If n =0 : return 0
     *  Test 2 : if n =1 : return 1
     *  Test 3 : If n = -1 : return 1
     *  Test 4 : If n = 4 : return 3 return fib(n-2)+ fib (n-1)
     *
     */

    fun fib(n: Int) : Long {
        if(n == 0 || n ==1){
            return n.toLong();
        }
        var a  = 0L
        var b = 1L
        var c = 1L
        (1..n-2).forEach { i ->
            c = a+b ;
            a = b
            b = c
        }
        return c;
    }

    /**
     * check if the braces are set correctly
     * e.g. "(a * b))" should return false
     * Test 1: "(a * b))" : return false
     * Test 2 : "(a * b) : return true
     * Test 3 : "((a+b": return false
     * Test 4 : "1+2+3" return false
     */
    fun checkBraces(string: String): Boolean {
        if(string.count { it == '(' } == 0 && string.count { it == '}' } == 0)
            return false
        return string.count { it == '(' } == string.count { it == ')'}
    }
}