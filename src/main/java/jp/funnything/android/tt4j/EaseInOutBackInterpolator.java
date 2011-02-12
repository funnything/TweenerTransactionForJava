package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInOutBackInterpolator extends Compounder {
    private final float _ammount;

    public EaseInOutBackInterpolator() {
        _ammount = 1.70158f;
    }

    public EaseInOutBackInterpolator( final float ammount ) {
        _ammount = ammount;
    }

    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseInBackInterpolator( _ammount );
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseOutBackInterpolator( _ammount );
    }
}
