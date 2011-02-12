package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutBackInterpolator extends Reverser {
    private final float _ammount;

    public EaseOutBackInterpolator() {
        _ammount = 1.70158f;
    }

    public EaseOutBackInterpolator( final float ammount ) {
        _ammount = ammount;
    }

    @Override
    protected Interpolator getSourceInterpolator() {
        return new EaseInBackInterpolator( _ammount );
    }
}
