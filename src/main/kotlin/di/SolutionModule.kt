package di

import dagger.Module
import dagger.Provides
import solution.nmodule.N1Solution
import solution.nmodule.N2Solution
import solution.nmodule.N3Solution
import solution.nmodule.N4Solution
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
}