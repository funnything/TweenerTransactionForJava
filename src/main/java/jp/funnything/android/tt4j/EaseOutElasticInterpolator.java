package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutElasticInterpolator extends Reverser {
    private final float _amplitude;
    private final float _period;

    public EaseOutElasticInterpolator() {
        _amplitude = 1;
        _period = 0.3f;
    }

    public EaseOutElasticInterpolator( final float amplitude , final float period ) {
        _amplitude = amplitude;
        _period = period;
    }

    @Override
    protected Interpolator getSourceInterpolator() {
        return new EaseInElasticInterpolator( _amplitude , _period );
    }
}
