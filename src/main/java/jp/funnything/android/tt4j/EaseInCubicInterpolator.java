package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInCubicInterpolator implements Interpolator {
    @Override
    public float getInterpolation( final float input ) {
        return input * input * input;
    }
}
