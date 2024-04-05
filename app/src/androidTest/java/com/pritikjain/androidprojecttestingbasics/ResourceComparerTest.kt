package com.pritikjain.androidprojecttestingbasics

import androidx.test.core.app.ApplicationProvider
import org.junit.Test
import android.content.Context
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before

class ResourceComparerTest {

    // Don't do this in project : this is bad practice
    //private val resourceComparer = ResourceComparer()

    private lateinit var resourceComparer : ResourceComparer

    /*
    ** This setup() function will run before every Test case as
    ** we annotate this function by @Before
    */
    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
    }

    /**
     * You can destroy your objects which you created before
     * Like if you do test RoomDB : you want to close the roomDB after all testing done
     *
     * */

    @After
    fun teardown() {

    }

    @Test
    fun stringResourceSameAsGivenString_returnTrue() {
        // Now each test case has its own instance
        // But creating instance on every test means 30 more instance creation in 30 test cases and
        // it is the lot of boilerplate code we are keep writing so there is this function called Setup by Junit we can use
        /* resourceComparer = ResourceComparer()*/

        // get the reference of context object
        val context  = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"UnitTestingYT")
        assertThat(result).isTrue()
    }
    @Test
    fun stringResourceDifferentAsGivenString_returnTrue() {
        //resourceComparer = ResourceComparer()
        // get the reference of context object
        val context  = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"Hello")
        assertThat(result).isFalse()
    }
}