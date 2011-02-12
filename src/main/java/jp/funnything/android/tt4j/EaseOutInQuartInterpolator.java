package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutInQuartInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseOutQuartInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseInQuartInterpolator();
    }
}
