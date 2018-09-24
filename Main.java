public class Main {

    public static void main(String[] args) {
	// write your code here
        float H1 = 72.0f;
        float D1 = 22.0f;
        float H2 = 19.0f;
        float D2 = 18.0f;
        float H3 = 50.0f;
        float D3 = 13.0f;
        float H4 = 67.0f;
        float D4 = 16.0f;
        float H5 = 16.0f;
        float D5 = 14.0f;
        float H6 = 53.0f;
        float D6 = 23.0f;
        float H7 = 69.0f;
        float D7 = 22.0f;
        float H8 = 30.0f;
        float D8 = 22.0f;
        float H9 = 52.0f;
        float D9 = 23.0f;
        float H10 = 40.0f;
        float D10 = 16.0f;
        float H11 = 31.0f;
        float D11 = 18.0f;
        float H12 = 75.0f;
        float D12 = 23.0f;

        float V1 = (3.14f)*(H1)*((D1/2)*(D1/2));
        float V2 = (3.14f)*(H2)*((D2/2)*(D2/2));
        float V3 = (3.14f)*(H3)*((D3/2)*(D3/2));
        float V4 = (3.14f)*(H4)*((D4/2)*(D4/2));
        float V5 = (3.14f)*(H5)*((D5/2)*(D5/2));
        float V6 = (3.14f)*(H6)*((D6/2)*(D6/2));
        float V7 = (3.14f)*(H7)*((D7/2)*(D7/2));
        float V8 = (3.14f)*(H8)*((D8/2)*(D8/2));
        float V9 = (3.14f)*(H9)*((D9/2)*(D9/2));
        float V10 = (3.14f)*(H10)*((D10/2)*(D10/2));
        float V11 = (3.14f)*(H11)*((D11/2)*(D11/2));
        float V12 = (3.14f)*(H12)*((D12/2)*(D12/2));

        float tWater = V1+V2+V3+V4+V5+V6+V7+V8+V9+V10+V11+V12;

        float CubicMetersPPPD = (((tWater / 37640.0f) * (65.0f / 0.246f)) / 28)*(0.246f/65);
        float waterSave = 0.246f - CubicMetersPPPD;

        System.out.printf("Each person in town needs to save %.3f cubic meters per day.",waterSave);
        System.out.println();


    }
}
