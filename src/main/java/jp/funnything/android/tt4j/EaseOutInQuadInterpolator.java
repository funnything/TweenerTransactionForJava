package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutInQuadInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseOutQuadInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseInQuadInterpolator();
    }
}
