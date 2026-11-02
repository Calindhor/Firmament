

package moe.nea.firmament.util.accessors

import me.shedaniel.math.Rectangle
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen
import moe.nea.firmament.mixins.accessor.AccessorHandledScreen
import moe.nea.firmament.util.customgui.customGui

fun AbstractContainerScreen<*>.getProperRectangle(): Rectangle {
    this.customGui?.getScreenRectangle()?.let { return it }
    this.castAccessor()
    return Rectangle(
        getX_Firmament(),
        getY_Firmament(),
        getBackgroundWidth_Firmament(),
        getBackgroundHeight_Firmament()
    )
}
