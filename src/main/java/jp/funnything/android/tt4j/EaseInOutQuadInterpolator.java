package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInOutQuadInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseInQuadInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseOutQuadInterpolator();
    }
}
