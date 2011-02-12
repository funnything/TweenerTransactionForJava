package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInOutExpoInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseInExpoInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseOutExpoInterpolator();
    }
}
