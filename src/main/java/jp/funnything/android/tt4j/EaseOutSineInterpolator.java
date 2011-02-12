package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutSineInterpolator implements Interpolator {
    @Override
    public float getInterpolation( final float input ) {
        return ( float ) Math.sin( Math.PI / 2 * input );
    }
}
