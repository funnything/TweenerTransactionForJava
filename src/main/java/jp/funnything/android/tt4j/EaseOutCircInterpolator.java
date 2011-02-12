package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutCircInterpolator implements Interpolator {
    @Override
    public float getInterpolation( final float input ) {
        return ( float ) Math.sqrt( 1 - ( input - 1 ) * ( input - 1 ) );
    }
}
