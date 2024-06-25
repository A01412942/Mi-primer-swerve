// By: Beatriz Marún 5959
package frc.team5959.subsystems;

//  =================
//       Red CAN
//  =================
//   0 · roboRIO
//   1 · PDP

//   2 · frontLeftRotation
//   3 · frontLeftDrive
//   4 · frontRightRotation
//   5 · frontRightDrive
//   6 · rearRightRotation
//   7 · rearRightDrive
//   8 · rearLeftRotation
//   9 · rearLeftDrive
//  =================


//poder modificar cosas del robot sin irse a lo más específico
public class Constants {
    
    public static class Chassis{
        
        public static final double maxSpeed = 0.9;
        public static final double robotRadius = 0.66; //metros, cambiar a elección

        //Modulos 
        public static final double frontLeftTranslationX = -0.5;
        public static final double frontLeftTranslationY = 0.5;

        public static final double frontRightTranslationX = 0.5;
        public static final double frontRightTranslationY = 0.5;

        public static final double rearLeftTranslationX = -0.5;
        public static final double rearLeftTranslationY = -0.5;

        public static final double rearRightTranslationX = 0.5;
        public static final double rearRightTranslationY = -0.5;
    
        public static final int frontLeftDriveMotorPort = 3;
        public static final int frontRightDriveMotorPort = 5;
        public static final int rearLeftDriveMotorPort = 9;
        public static final int rearRightDriveMotorPort = 7;

        public static final int frontLeftRotationMotorPort = 2;
        public static final int frontRightRotationMotorPort = 4;
        public static final int rearLeftRotationMotorPort = 8;
        public static final int rearRightRotationMotorPort = 6;

        public static final int frontLeftCANcoderPort = 10;
        public static final int frontRightCANcoderPort = 11;
        public static final int rearLeftCANcoderPort = 13;
        public static final int rearRightCANcoderPort = 12;

        public static final double frontLeftKp = 0.0;
        public static final double frontLeftKi = 0.0;
        public static final double frontLeftKd = 0.0;

        public static final double frontRightKp = 0.0;
        public static final double frontRightKi = 0.0;
        public static final double frontRightKd = 0.0;

        public static final double rearLeftKp = 0.0;
        public static final double rearLeftKi = 0.0;
        public static final double rearLeftKd = 0.0;

        public static final double rearRightKp = 0.0;
        public static final double rearRightKi = 0.0;
        public static final double rearRightKd = 0.0;
        
        public static final double driveKp = 0.0;
        public static final double driveKi = 0.0;
        public static final double driveKd = 0.0;
        
        public static final double rotationKp = 0.0;
        public static final double rotationKi = 0.0;
        public static final double rotationKd = 0.0;
    }
    public static class Module{
        
        public static final double driveRevsToMeters = 4 * Math.PI / (29.27 * 8.14) * 1.98; //revoluciones a metros (cyberius)
    }



}
