package di

import dagger.Module
import dagger.Provides
import solution.nmodule.*
import javax.inject.Singleton

/**
@author boolenull on 17.03.2019
 */

@Module
class SolutionModule {

    @Singleton
    @Provides
    fun provideN0Solution(): N0Solution {
        return N0Solution()
    }

    @Singleton
    @Provides
    fun provideN1Solution(): N1Solution {
        return N1Solution()
    }

    @Singleton
    @Provides
    fun provideN2Solution(): N2Solution {
        return N2Solution()
    }

    @Singleton
    @Provides
    fun provideN3Solution(): N3Solution {
        return N3Solution()
    }

    @Singleton
    @Provides
    fun provideN4Solution(): N4Solution {
        return N4Solution()
    }

    @Singleton
    @Provides
    fun provideN5Solution(): N5Solution {
        return N5Solution()
    }

    @Singleton
    @Provides
    fun provideN6Solution(): N6Solution {
        return N6Solution()
    }

    @Singleton
    @Provides
    fun provideN7Solution(): N7Solution {
        return N7Solution()
    }

    @Singleton
    @Provides
    fun provideN8Solution(): N8Solution {
        return N8Solution()
    }

    @Singleton
    @Provides
    fun provideN9Solution(): N9Solution {
        return N9Solution()
    }

    @Singleton
    @Provides
    fun provideN10Solution(): N10Solution {
        return N10Solution()
    }

    @Singleton
    @Provides
    fun provideN11Solution(): N11Solution {
        return N11Solution()
    }

    @Singleton
    @Provides
    fun provideN12Solution(): N12Solution {
        return N12Solution()
    }

    @Singleton
    @Provides
    fun provideN13Solution(): N13Solution {
        return N13Solution()
    }

    @Singleton
    @Provides
    fun provideN14Solution(): N14Solution {
        return N14Solution()
    }
}