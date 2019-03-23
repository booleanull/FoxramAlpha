package di

import dagger.Module
import dagger.Provides
import managers.solution.nmodule.*
import managers.solution.qmodule.*
import managers.solution.zmodule.*
import javax.inject.Singleton

/**
@author boolenull on 17.03.2019
 */

@Module
class SolutionModule {

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

    @Singleton
    @Provides
    fun provideZ1Solution(): Z1Solution {
        return Z1Solution()
    }

    @Singleton
    @Provides
    fun provideZ2Solution(): Z2Solution {
        return Z2Solution()
    }

    @Singleton
    @Provides
    fun provideZ3Solution(): Z3Solution {
        return Z3Solution()
    }

    @Singleton
    @Provides
    fun provideZ4Solution(): Z4Solution {
        return Z4Solution()
    }

    @Singleton
    @Provides
    fun provideZ5Solution(): Z5Solution {
        return Z5Solution()
    }

    @Singleton
    @Provides
    fun provideZ6Solution(): Z6Solution {
        return Z6Solution()
    }

    @Singleton
    @Provides
    fun provideZ7Solution(): Z7Solution {
        return Z7Solution()
    }

    @Singleton
    @Provides
    fun provideZ8Solution(): Z8Solution {
        return Z8Solution()
    }

    @Singleton
    @Provides
    fun provideZ9Solution(): Z9Solution {
        return Z9Solution()
    }

    @Singleton
    @Provides
    fun provideZ10Solution(): Z10Solution {
        return Z10Solution()
    }

    @Singleton
    @Provides
    fun provideQ1Solution(): Q1Solution {
        return Q1Solution()
    }

    @Singleton
    @Provides
    fun provideQ2Solution(): Q2Solution {
        return Q2Solution()
    }

    @Singleton
    @Provides
    fun provideQ3Solution(): Q3Solution {
        return Q3Solution()
    }

    @Singleton
    @Provides
    fun provideQ4Solution(): Q4Solution {
        return Q4Solution()
    }

    @Singleton
    @Provides
    fun provideQ5Solution(): Q5Solution {
        return Q5Solution()
    }

    @Singleton
    @Provides
    fun provideQ6Solution(): Q6Solution {
        return Q6Solution()
    }

    @Singleton
    @Provides
    fun provideQ7Solution(): Q7Solution {
        return Q7Solution()
    }

    @Singleton
    @Provides
    fun provideQ8Solution(): Q8Solution {
        return Q8Solution()
    }
}