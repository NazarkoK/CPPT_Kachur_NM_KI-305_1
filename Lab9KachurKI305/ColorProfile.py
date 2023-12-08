class ColorProfile:
    def __init__(self, profile_name):
        self.profile_name = profile_name

    def apply_profile(self):
        print(f"Applying color profile: {self.profile_name}")
