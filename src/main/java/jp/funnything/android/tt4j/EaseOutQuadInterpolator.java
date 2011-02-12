package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutQuadInterpolator extends Reverser {
    @Override
    protected Interpolator getSourceInterpolator() {
        return new EaseInQuadInterpolator();
    }
}
