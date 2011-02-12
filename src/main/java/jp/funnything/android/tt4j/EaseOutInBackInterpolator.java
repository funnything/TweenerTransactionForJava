package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutInBackInterpolator extends Compounder {
    private final float _ammount;

    public EaseOutInBackInterpolator() {
        _ammount = 1.70158f;
    }

    public EaseOutInBackInterpolator( final float ammount ) {
        _ammount = ammount;
    }

    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseOutBackInterpolator( _ammount );
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseInBackInterpolator( _ammount );
    }
}
