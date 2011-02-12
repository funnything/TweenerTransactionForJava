package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInExpoInterpolator implements Interpolator {
    @Override
    public float getInterpolation( final float input ) {
        return ( float ) Math.pow( 2 , 10 * ( input - 1 ) );
    }
}
