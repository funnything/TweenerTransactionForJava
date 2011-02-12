package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInOutElasticInterpolator extends Compounder {
    private final float _amplitude;
    private final float _period;

    public EaseInOutElasticInterpolator() {
        _amplitude = 1;
        _period = 0.3f;
    }

    public EaseInOutElasticInterpolator( final float amplitude , final float period ) {
        _amplitude = amplitude;
        _period = period;
    }

    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseInElasticInterpolator( _amplitude , _period );
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseOutElasticInterpolator( _amplitude , _period );
    }
}
