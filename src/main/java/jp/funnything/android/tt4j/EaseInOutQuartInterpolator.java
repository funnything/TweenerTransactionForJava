package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInOutQuartInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseInQuartInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseOutQuartInterpolator();
    }
}
