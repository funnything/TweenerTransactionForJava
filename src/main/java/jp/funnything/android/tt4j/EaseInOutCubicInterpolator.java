package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInOutCubicInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseInCubicInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseOutCubicInterpolator();
    }
}
