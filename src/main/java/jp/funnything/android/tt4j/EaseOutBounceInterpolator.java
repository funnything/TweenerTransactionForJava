package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutBounceInterpolator implements Interpolator {
    @Override
    public float getInterpolation( final float input ) {
        final float BASE = 2.75f;
        final float FACTOR = 7.5625f;

        if ( input < 1 / BASE ) {
            return FACTOR * input * input;
        } else if ( input < 2 / BASE ) {
            return FACTOR * ( input - 1.5f / BASE ) * ( input - 1.5f / BASE ) + 0.75f;
        } else if ( input < 2.5f / BASE ) {
            return FACTOR * ( input - 2.25f / BASE ) * ( input - 2.25f / BASE ) + 0.9375f;
        } else {
            return FACTOR * ( input - 2.625f / BASE ) * ( input - 2.625f / BASE ) + 0.984375f;
        }
    }
}
