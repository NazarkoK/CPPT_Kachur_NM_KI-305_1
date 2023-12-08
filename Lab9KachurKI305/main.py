from Monitor import Monitor, BrightnessControl
from TouchScreen import TouchScreen
from ColorProfile import ColorProfile

def interact_with_touch_screen(touch_screen):
    touch_screen.touch()
    touch_screen.interact()

if __name__ == '__main__':



    # Create the first monitor
    monitor1 = Monitor("Dell", 24, 1920, 1080)
    monitor1.power_on()

    monitor1.display_info()

    # Change brightness of the first monitor
    monitor1.brightness_control.change_brightness()
    monitor1.display_info()

    # Create the touch screen
    touch_screen = TouchScreen()

    # Interact with the touch screen
    interact_with_touch_screen(touch_screen)

    # Apply color profile
    color_profile = ColorProfile("sRGB")
    color_profile.apply_profile()

    monitor1.power_off()

    # Create the second monitor interactively
    monitor2 = Monitor("", 0, 0, 0)  # Initialize with default values
    monitor2.input_monitor_data()
    monitor2.power_on()
    monitor2.display_info()

    # Interact with the touch screen of the second monitor
    interact_with_touch_screen(TouchScreen())

    # Change brightness of the second monitor
    monitor2.brightness_control.change_brightness()
    monitor2.display_info()

    monitor2.power_off()