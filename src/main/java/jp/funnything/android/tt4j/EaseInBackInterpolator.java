package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInBackInterpolator implements Interpolator {
    private final float _ammount;

    public EaseInBackInterpolator() {
        _ammount = 1.70158f;
    }

    public EaseInBackInterpolator( final float ammount ) {
        _ammount = ammount;
    }

    @Override
    public float getInterpolation( final float input ) {
        return input * input * ( ( _ammount + 1 ) * input - _ammount );
    }
}
